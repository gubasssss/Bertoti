public class BibliotecaSystem {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        Usuario u1 = new Usuario("Ana", new EmailNotificacao());
        Usuario u2 = new Usuario("Carlos", new SMSNotificacao());

        biblioteca.adicionarObserver(u1);
        biblioteca.adicionarObserver(u2);

        Livro l1 = new Livro("Dom Casmurro") {
            public void exibir() {
                System.out.println("- " + titulo);
            }
        };

        Livro l2 = new Livro("Memórias Póstumas") {
            public void exibir() {
                System.out.println("- " + titulo);
            }
        };

        Categoria categoria = new Categoria("Machado de Assis");
        categoria.adicionar(l1);
        categoria.adicionar(l2);

        categoria.exibir();

        biblioteca.emprestarLivro("Dom Casmurro");
    }
}
