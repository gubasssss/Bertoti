public class Teste {
    public static void main(String[] args) {
        Checkout compra = new Checkout();

        compra.setFormaPagamento(new Pix());
        compra.finalizarCompra(150.0);

        compra.setFormaPagamento(new CartaoCredito());
        compra.finalizarCompra(320.0);
    }
}
