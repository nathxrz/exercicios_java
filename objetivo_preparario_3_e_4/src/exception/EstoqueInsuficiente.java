package exception;

public class EstoqueInsuficiente extends RuntimeException {
    public EstoqueInsuficiente(String mensagem) {
        super(mensagem);
    }
}