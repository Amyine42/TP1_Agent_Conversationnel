package ma.emsi.amine.tp1_api_direct.exceptions;

/**
 * Exception personnalisée pour signaler les erreurs liées
 * aux requêtes envoyées ou reçues lors des interactions avec l'API.
 */

public class RequeteException extends Exception {
    /**
     * Constructeur avec un message.
     * @param message le message décrivant l'erreur.
     */
    public RequeteException(String message) {
        super();
    }

    /**
     * Constructeur avec un message et une cause.
     * @param message le message décrivant l'erreur.
     * @param cause la cause sous-jacente de l'exception.
     */
    public RequeteException(String message, Throwable cause) {
        super(message,cause);
    }

    public RequeteException(String message, String s) {

    }
}
