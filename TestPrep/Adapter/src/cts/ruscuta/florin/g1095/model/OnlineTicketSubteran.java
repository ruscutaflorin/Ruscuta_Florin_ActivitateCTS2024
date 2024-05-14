package cts.ruscuta.florin.g1095.model;

public class OnlineTicketSubteran extends CalatorieSubteran{
    private int nrCalatorii;

    public OnlineTicketSubteran(String numeClient, String cnp, int nrCalatorii) {
        super(numeClient, cnp);
        this.nrCalatorii=nrCalatorii;
    }
    @Override
    public boolean esteValid() {
        if(this.nrCalatorii<=0){
            return false;
        }
        this.nrCalatorii-=1;
        return true;
    }
}
