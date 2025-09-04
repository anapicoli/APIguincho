package anapicoli.guincho.repository;

import anapicoli.guincho.model.solicitacaoguincho;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface solicitacaoguinchorepository extends JpaRepository<solicitacaoguincho, Integer>{
}
