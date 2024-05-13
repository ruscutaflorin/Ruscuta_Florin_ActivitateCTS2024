package cts.ruscuta.florin.g1095.model;

public interface IClient {
	String getNume();
	void notifica(String mesaj);
	void platesteComanda(String comanda, double total);
}
