public class Produto {
    private String nome;
    private int quantidade;
    private SistemaEstoque sistemaEstoque;

    public Produto(String nome, int quantidade, SistemaEstoque sistemaEstoque) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.sistemaEstoque = sistemaEstoque;
    }

    public void consumir(int quantidade) {
        this.quantidade -= quantidade;
        System.out.println("Produto consumido: " + nome + ", nova quantidade: " + this.quantidade);
        if (this.quantidade < 5) {
            sistemaEstoque.notificarObservers(nome, this.quantidade);
        }
    }
}
