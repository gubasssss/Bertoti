public interface SistemaEstoque {
    void adicionarObserver(EstoqueObserver observer);
    void removerObserver(EstoqueObserver observer);
    void notificarObservers(String nomeProduto, int quantidade);
}
