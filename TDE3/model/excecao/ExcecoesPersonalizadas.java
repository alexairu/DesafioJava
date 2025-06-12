package model.excecao;

public class VeiculoNaoEncontradoException extends Exception {
    public VeiculoNaoEncontradoException(String mensagem) {
        super(mensagem);
    }
}

class EntradaInvalidaException extends Exception {
    public EntradaInvalidaException(String mensagem) {
        super(mensagem);
    }
}
