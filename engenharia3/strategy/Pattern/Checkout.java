public class Checkout {
    private Pagamento formaPagamento;

    public void setFormaPagamento(Pagamento formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public void finalizarCompra(double valor) {
        formaPagamento.pagar(valor);
    }
}
