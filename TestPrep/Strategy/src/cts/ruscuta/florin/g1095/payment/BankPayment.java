package cts.ruscuta.florin.g1095.payment;

public class BankPayment implements PaymentService{
    @Override
    public void pay(double amount) {
        System.out.println("Am platit prin banca!");
    }
}
