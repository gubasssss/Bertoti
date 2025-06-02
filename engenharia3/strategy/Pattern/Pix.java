public class Pix implements Pagamento {
    public void pagar(double valor) {
        System.out.println("Pagando R$" + valor + " via Pix.");
    }
}
