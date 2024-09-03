package exception;

public class FaltaEnderecoDeEntregaException extends RuntimeException{
    public FaltaEnderecoDeEntregaException(String mensagem) {
        super(mensagem);
    }
}
