package cts.ruscuta.florin.g1095.model;

import cts.ruscuta.florin.g1095.payment.PaymentService;

public interface IClient {
	String getNume();
	void notifica(String mesaj);
	void platesteComanda(String comanda, double total, PaymentService paymentService);
}
