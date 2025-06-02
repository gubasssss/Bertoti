public class AppMobile implements EstoqueObserver {
    private String usuario;

    public AppMobile(String usuario) {
        this.usuario = usuario;
    }

    @Override
    public void atualizar(String nomeProduto, int quantidade) {
        System.out.println("[App Mobile] " + usuario + ": Estoque baixo para " + nomeProduto + ". Quantidade: " + quantidade);
    }
}
