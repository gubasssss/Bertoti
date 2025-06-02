import java.util.ArrayList;
import java.util.List;

public class Categoria extends Livro {
    private List<Livro> livros = new ArrayList<>();

    public Categoria(String titulo) {
        super(titulo);
    }

    public void adicionar(Livro livro) {
        livros.add(livro);
    }

    public void exibir() {
        System.out.println("Categoria: " + titulo);
        for (Livro livro : livros) {
            livro.exibir();
        }
    }
}
