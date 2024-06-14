package br.com.vulpicula.uShorter.exceptions;

/**
 * Exceção lançada quando uma URL não pôde ser encontrada.
 */
public class UrlNotFoundException extends RuntimeException {

    /**
     * Cria uma nova instância da exceção com uma mensagem específica.
     * @param message A mensagem de erro detalhando a causa da exceção.
     */
    public UrlNotFoundException(String message) {
        super(message);
    }
}
