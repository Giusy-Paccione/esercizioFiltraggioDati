package FiltraggioDati;

public class Prodotto {

	private String nome;
	private String categoria;
	private double prezzo;
	
	public String getNome() {
		return nome;
	}
	
	public String getCategoria() {
		return categoria;
	}
	
	public double getPrezzo() {
		return prezzo;
	}
	
	
	public Prodotto(String nome, String categoria, double prezzo) {
		
		this.nome = nome;
		this.categoria = categoria;
		this.prezzo = prezzo;
	}

	

}
/*Crea una classe Prodotto con attributi nome, categoria e prezzo.
Crea un ArrayList di prodotti con almeno 5 elementi.
Implementa un metodo che filtra e restituisce solo i prodotti appartenenti a una determinata categoria (ad esempio, "Elettronica").
Stampa i prodotti filtrati.
Obiettivo: Applicare i metodi sugli ArrayList per filtrare i dati in base a criteri specifici.*/