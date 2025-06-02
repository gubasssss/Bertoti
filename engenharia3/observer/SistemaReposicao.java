public class SistemaReposicao implements EstoqueObserver {
    @Override
    public void atualizar(String nomeProduto, int quantidade) {
        System.out.println("[Sistema de Reposição] Iniciando reposição para o produto: " + nomeProduto);
    }
}
