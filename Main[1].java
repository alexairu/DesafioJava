public class Main {
    public static void main(String[] args) {
        Pagamento pagamentoCartao = new CartaoCredito();
        Pagamento pagamentoBoleto = new BoletoBancario();

        pagamentoCartao.realizarPagamento(150.75);
        pagamentoBoleto.realizarPagamento(89.90);
    }
}
