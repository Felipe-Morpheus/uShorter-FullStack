package br.com.vulpicula.uShorter.services;

import br.com.vulpicula.uShorter.exceptions.UrlNotFoundException;
import br.com.vulpicula.uShorter.models.Url;
import br.com.vulpicula.uShorter.models.UrlClick;
import br.com.vulpicula.uShorter.repositories.UrlClickRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class UrlClickService {

    @Autowired
    private UrlClickRepository urlClickRepository;

    @Autowired
    private UrlService urlService;

    /**
     * Registra um clique associado a uma URL curta.
     * @param urlCurta A URL curta para a qual o clique será registrado.
     * @throws UrlNotFoundException Se a URL original correspondente à URL curta não puder ser encontrada.
     */
    public void registrarClickByUrlCurta(String urlCurta) throws UrlNotFoundException {
        // Encontre a URL correspondente à URL curta fornecida
        Url urlOriginal = urlService.buscarUrlPorUrlCurta(urlCurta);

        if (urlOriginal != null) {
            // Se a URL original for encontrada, registre o clique associado a ela
            UrlClick click = new UrlClick();
            click.setHorarioClique(LocalDateTime.now());
            click.setUrl(urlOriginal);
            urlClickRepository.save(click);
        } else {
            // Se a URL original não for encontrada, lança uma exceção UrlNotFoundException
            throw new UrlNotFoundException("URL original não encontrada para a URL curta: " + urlCurta);
        }
    }
}
