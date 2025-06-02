import java.util.ArrayList;
import java.util.List;

public class SistemaEstoqueImpl implements SistemaEstoque {
    private List<EstoqueObserver> observers = new ArrayList<>();

    @Override
    public void adicionarObserver(EstoqueObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removerObserver(EstoqueObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notificarObservers(String nomeProduto, int quantidade) {
        for (EstoqueObserver observer : observers) {
            observer.atualizar(nomeProduto, quantidade);
        }
    }
}
