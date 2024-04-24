package clase;

public class Cash extends ModPlata{

    private int sumaBani;

    public Cash(int sumaBani) {
        this.sumaBani = sumaBani;
    }

    @Override
    public void plateste(int suma, String nume) {
        if(sumaBani >= suma){
            System.out.println("Plata realizata cash");
            sumaBani -= suma;
        }else{
            getSuccesor().plateste(suma,nume);
        }
    }
}