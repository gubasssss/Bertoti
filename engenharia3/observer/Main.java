public class Main {
    public static void main(String[] args) {
        SistemaEstoqueImpl estoque = new SistemaEstoqueImpl();

        estoque.adicionarObserver(new AppMobile("João"));
        estoque.adicionarObserver(new PainelSupervisao());
        estoque.adicionarObserver(new SistemaReposicao());

        Produto arroz = new Produto("Arroz", 10, estoque);

        arroz.consumir(3);  
        arroz.consumir(3);  
        arroz.consumir(1);  
    }
}
