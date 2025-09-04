package anapicoli.guincho.service;

import anapicoli.guincho.model.solicitacaoguincho;
import anapicoli.guincho.repository.solicitacaoguinchorepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class solicitacaoguinchoservice {
    private final solicitacaoguinchorepository repository;

    public solicitacaoguinchoservice(solicitacaoguinchorepository repository){
        this.repository = repository;
    }

    public List<solicitacaoguincho> listartodos(){
        return repository.findAll();
    }

    public Optional<solicitacaoguincho> buscarPorId(Integer id){
        return repository.findById(id);
    }

    public solicitacaoguincho salvar(solicitacaoguincho solicitacao){
        return repository.save(solicitacao);
    }

    public void deletar(Integer id){
        repository.deleteById(id);
    }
}
