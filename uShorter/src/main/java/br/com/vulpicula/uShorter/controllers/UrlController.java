package br.com.vulpicula.uShorter.controllers;

import br.com.vulpicula.uShorter.models.Url;
import br.com.vulpicula.uShorter.services.UrlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Controlador para lidar com operações relacionadas a URLs.
 */
@Controller
@RequestMapping("/urls")
public class UrlController {

    @Autowired
    private UrlService urlService;

    /**
     * Endpoint para encurtar uma URL.
     * @param url A URL original a ser encurtada.
     * @return A URL encurtada e o status HTTP 201 se bem-sucedido.
     */
    @PostMapping("/encurtar")
    public ResponseEntity<Url> encurtarUrl(@RequestBody Url url) {
        Url urlEncurtada = urlService.salvarUrl(url);
        return new ResponseEntity<>(urlEncurtada, HttpStatus.CREATED);
    }

    /**
     * Endpoint para redirecionar uma URL curta para a URL original.
     * @param urlCurta A URL curta a ser redirecionada.
     * @return A URL original e o status HTTP 302 se encontrada, ou uma mensagem de erro e o status HTTP 404 se não encontrada.
     */
    @GetMapping("/{urlCurta}")
    public ResponseEntity<String> redirecionarUrl(@PathVariable String urlCurta) {
        Url urlOriginal = urlService.buscarUrlPorUrlCurta(urlCurta);
        if (urlOriginal != null) {
            // Aqui você redirecionaria o usuário para a URL original
            return new ResponseEntity<>(urlOriginal.getUrlOriginal(), HttpStatus.FOUND);
        } else {
            return new ResponseEntity<>("URL não encontrada", HttpStatus.NOT_FOUND);
        }
    }

    /**
     * Endpoint para obter a lista de URLs encurtadas.
     * @return A lista de URLs encurtadas e o status HTTP 200.
     */
    @GetMapping("/listar")
    public ResponseEntity<List<Url>> listarUrls() {
        List<Url> urls = urlService.buscarTodasUrls();
        return new ResponseEntity<>(urls, HttpStatus.OK);
    }
}
