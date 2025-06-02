public class Usuario implements Observer {
    private String nome;
    private NotificacaoStrategy estrategia;

    public Usuario(String nome, NotificacaoStrategy estrategia) {
        this.nome = nome;
        this.estrategia = estrategia;
    }

    public void update(String mensagem) {
        System.out.print(nome + " recebeu notificação: ");
        estrategia.notificar(mensagem);
    }
}
