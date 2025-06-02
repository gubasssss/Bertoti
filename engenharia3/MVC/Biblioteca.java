import java.util.ArrayList;
import java.util.List;

public class Biblioteca implements Subject {
    private List<Observer> observers = new ArrayList<>();

    public void adicionarObserver(Observer o) {
        observers.add(o);
    }

    public void removerObserver(Observer o) {
        observers.remove(o);
    }

    public void notificarObservers(String mensagem) {
        for (Observer o : observers) {
            o.update(mensagem);
        }
    }

    public void emprestarLivro(String titulo) {
        System.out.println("Livro emprestado: " + titulo);
        notificarObservers("O livro \"" + titulo + "\" foi emprestado.");
    }
}
