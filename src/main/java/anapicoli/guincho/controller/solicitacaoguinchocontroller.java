package anapicoli.guincho.controller;

import anapicoli.guincho.model.solicitacaoguincho;
import anapicoli.guincho.service.solicitacaoguinchoservice;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/guincho")
public class solicitacaoguinchocontroller {

    private final solicitacaoguinchoservice service;

    public solicitacaoguinchocontroller(solicitacaoguinchoservice service) {
        this.service = service;
    }

    @GetMapping
    public List<solicitacaoguincho> listartodos() {
        return service.listartodos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<solicitacaoguincho> buscarPorId(@PathVariable Integer id) {
        return service.buscarPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public solicitacaoguincho criar(@RequestBody solicitacaoguincho solicitacao) {
        return service.salvar(solicitacao);
    }

    @PutMapping("/{id}")
    public ResponseEntity<solicitacaoguincho> atualizar(@PathVariable Integer id,
                                                        @RequestBody solicitacaoguincho solicitacao) {
        return service.buscarPorId(id).map(existing -> {
            solicitacao.setId(existing.getId());
            return ResponseEntity.ok(service.salvar(solicitacao));
        }).orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Integer id) {
        return service.buscarPorId(id).map(existing -> {
            service.deletar(id);
            return ResponseEntity.noContent().<Void>build();
        }).orElse(ResponseEntity.notFound().build());
    }
}
