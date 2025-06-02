public class SMSNotificacao implements NotificacaoStrategy {
    public void notificar(String mensagem) {
        System.out.println("Enviando SMS: " + mensagem);
    }
}
