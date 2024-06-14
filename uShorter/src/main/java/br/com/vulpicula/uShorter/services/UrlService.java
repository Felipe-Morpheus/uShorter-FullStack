package br.com.vulpicula.uShorter.services;

import br.com.vulpicula.uShorter.models.Url;
import br.com.vulpicula.uShorter.repositories.UrlRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class UrlService {


    @Autowired
    private UrlRepository urlRepository;

    public Url salvarUrl(Url url) {
        // Lógica para gerar a URL curta
        url.setUrlCurta(gerarUrlCurta());

        // Define a data de criação como a data e hora atuais
        url.setDataCriacao(LocalDateTime.now());

        // Salva a URL no banco de dados
        return urlRepository.save(url);
    }
    // Retorna a URL correspondente à URL curta fornecida.
    public Url buscarUrlPorUrlCurta(String urlCurta) {
        return urlRepository.findByUrlCurta(urlCurta);
    }
    // Retorna uma lista de todas as URLs armazenadas no banco de dados.
    public List<Url> buscarTodasUrls() {
        return urlRepository.findAll();
    }

    // Método privado para gerar a URL curta
    private String gerarUrlCurta() {
             return "urlCurtaGerada";
    }
}
