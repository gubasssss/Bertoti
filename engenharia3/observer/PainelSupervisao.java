public class PainelSupervisao implements EstoqueObserver {
    @Override
    public void atualizar(String nomeProduto, int quantidade) {
        System.out.println("[Painel de Supervisão] ALERTA: Produto " + nomeProduto + " abaixo do limite. Restam: " + quantidade);
    }
}
