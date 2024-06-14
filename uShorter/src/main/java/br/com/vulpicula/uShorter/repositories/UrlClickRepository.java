package br.com.vulpicula.uShorter.repositories;

import br.com.vulpicula.uShorter.models.UrlClick;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repositório para a entidade UrlClick, responsável por interagir com o banco de dados
 * e executar operações relacionadas aos cliques em URLs encurtadas.
 */
@Repository
public interface UrlClickRepository extends JpaRepository<UrlClick, Long> {

}
