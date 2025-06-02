public class Teste {
    public static void main(String[] args) {
        Checkout compra = new Checkout();
        compra.pagar("Pix", 100.0);
        compra.pagar("Cartao", 300.0);
    }
}
