package restaurant;

public class SalaSport extends Subiect{
    @Override
    public void notificareMeniuNou() {
        throw  new UnsupportedOperationException();
    }

    @Override
    public void notificarePretNou() {
        throw  new UnsupportedOperationException();
    }

    @Override
    public void notificareEveniment(String data) {
        notificaClienti("In data de " + data + " in sala de sport va avea loc un eveniment");
    }

    public void notificareMeciVolei(){
        notificaClienti("In sala de sport va avea loc un meci de volei");
    }
}