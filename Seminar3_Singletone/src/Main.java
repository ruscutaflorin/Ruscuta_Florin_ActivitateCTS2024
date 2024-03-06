import singleton.Guvern;

public class Main {
    public static void main(String[] args) {

        Guvern guvern = Guvern.getInstance(1, "flo", 12);
        Guvern guvern2 = Guvern.getInstance(1, "flo", 12);


        System.out.println(guvern);
    }
}