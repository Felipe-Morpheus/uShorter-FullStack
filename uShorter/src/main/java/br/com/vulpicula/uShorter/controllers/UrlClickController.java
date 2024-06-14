package br.com.vulpicula.uShorter.controllers;

import br.com.vulpicula.uShorter.services.UrlClickService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/urlclicks")
public class UrlClickController {

    @Autowired
    private UrlClickService urlClickService;

    /**
     * Controlador para lidar com o registro de cliques em URLs curtas.
     * @param urlCurta A URL curta para a qual o clique será registrado.
     * @return ResponseEntity com o status HTTP indicando o resultado da operação.
     */
    @PostMapping("/registrar")
    public ResponseEntity<Void> registrarClick(@RequestBody String urlCurta) {
        // Chama o serviço para registrar o clique associado à URL curta fornecida
        urlClickService.registrarClickByUrlCurta(urlCurta);
        // Retorna uma resposta HTTP indicando que o clique foi registrado com sucesso
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
