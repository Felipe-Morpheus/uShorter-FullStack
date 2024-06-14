package br.com.vulpicula.uShorter.modelstest;

import br.com.vulpicula.uShorter.models.Url;
import br.com.vulpicula.uShorter.repositories.UrlRepository;
import br.com.vulpicula.uShorter.services.UrlService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.*;

/**
 * Testes unitários para a classe UrlService.
 */
public class UrlServiceTest {

    @Mock
    private UrlRepository urlRepository;

    @InjectMocks
    private UrlService urlService;

    /**
     * Configuração inicial para cada teste.
     */
    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    /**
     * Teste para o método salvarUrl.
     */
    @Test
    public void testSalvarUrl() {
        // Cria um objeto Url para teste
        Url url = new Url();
        url.setUrlOriginal("https://example.com");

        // Configura o comportamento esperado para o mock do repositório
        when(urlRepository.save(any(Url.class))).thenReturn(url);

        // Chama o método a ser testado
        Url savedUrl = urlService.salvarUrl(url);

        // Verifica se o método save do repositório foi chamado uma vez
        verify(urlRepository, times(1)).save(url);

        // Verifica se o objeto retornado não é nulo
        assertNotNull(savedUrl);

        // Verifica se a URL original do objeto retornado é a mesma que foi configurada
        assertEquals("https://example.com", savedUrl.getUrlOriginal());
    }
}
