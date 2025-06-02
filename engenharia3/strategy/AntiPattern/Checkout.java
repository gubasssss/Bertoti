public class Checkout {
    public void pagar(String metodo, double valor) {
        if (metodo.equals("Pix")) {
            System.out.println("Pagando R$" + valor + " via Pix.");
        } else if (metodo.equals("Cartao")) {
            System.out.println("Pagando R$" + valor + " com Cartão de Crédito.");
        } else if (metodo.equals("PayPal")) {
            System.out.println("Pagando R$" + valor + " com PayPal.");
        }
    }
}
