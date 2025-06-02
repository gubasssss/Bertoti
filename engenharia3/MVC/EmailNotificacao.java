public class EmailNotificacao implements NotificacaoStrategy {
    public void notificar(String mensagem) {
        System.out.println("Enviando EMAIL: " + mensagem);
    }
}
