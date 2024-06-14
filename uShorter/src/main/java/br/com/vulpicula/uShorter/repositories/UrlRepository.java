package br.com.vulpicula.uShorter.repositories;

import br.com.vulpicula.uShorter.models.Url;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
/**
 * Repositório para a entidade Url, responsável por interagir com o banco de dados
 * e executar operações relacionadas às URLs encurtadas.
 */
@Repository
public interface UrlRepository extends JpaRepository<Url, Long> {

    // * Retorna a URL correspondente à URL curta fornecida.
    Url findByUrlCurta(String urlCurta);

}
