package FiltraggioDati;

import java.util.ArrayList;

public class main {

	public static void main(String[] args) {
		// creo un ArrayList di Prodotto
		ArrayList<Prodotto> prodotti = new ArrayList<Prodotto>();

		// aggiungo i prodotti all'ArrayList
		prodotti.add(new Prodotto("Gocciole", "colazione", 3.50));
		prodotti.add(new Prodotto("Pepsi", "bevande", 1.90));
		prodotti.add(new Prodotto("Pringles", "snack", 2.60));
		prodotti.add(new Prodotto("Fanta", "bevande", 1.85));
		prodotti.add(new Prodotto("avocado", "frutta", 1.99));
		// richiamo il metodo per filtrare le bevande
		filtraBevande(prodotti);
	}

	// creo un metodo che filtri le bevande per categoria
	public static void filtraBevande(ArrayList<Prodotto> prodotti) {
		System.out.println("I prodotti della categoria bevande sono: ");
		for (Prodotto i : prodotti) {
			if (i.getCategoria() == "bevande") {

				System.out.println(i.getNome() + "\n");
			}
		}
	}

}
/*
 * Crea una classe Prodotto con attributi nome, categoria e prezzo. Crea un
 * ArrayList di prodotti con almeno 5 elementi. Implementa un metodo che filtra
 * e restituisce solo i prodotti appartenenti a una determinata categoria (ad
 * esempio, "Elettronica"). Stampa i prodotti filtrati. Obiettivo: Applicare i
 * metodi sugli ArrayList per filtrare i dati in base a criteri specifici.
 */