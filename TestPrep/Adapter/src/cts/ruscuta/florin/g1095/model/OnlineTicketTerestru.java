package cts.ruscuta.florin.g1095.model;

public class OnlineTicketTerestru extends CalatorieTerestra {
    private int soldCard;
    private double pretCalatorie = 3.2;

    public OnlineTicketTerestru(String cnp, String nume, int soldCard) {
        super(cnp, nume);
        this.soldCard = soldCard;
    }

    @Override
    public void validareCalatorie() {
        if(soldCard >= pretCalatorie){
            System.out.println("Calatorie placuta!");
            soldCard -= pretCalatorie;
        }else{
            System.out.println("Fonduri insuficiente!");
        }
    }
}
