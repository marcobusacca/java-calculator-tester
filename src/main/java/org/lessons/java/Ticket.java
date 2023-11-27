package org.lessons.java;

public class Ticket {

	static final double PRICE_FOR_KM = 0.21;
	static final int MINORS_DISCOUNT  = 20;
	static final int COVER_65_DISCOUNT  = 40;
	
	private int numKm;
	private int age;
	
	
	public Ticket(int numKm, int age) throws Exception {

		setNumKm(numKm);
		setAge(age);
	}
	
	
	public int getNumKm() {
		return numKm;
	}
	public void setNumKm(int numKm) throws Exception {
		
		if(numKm <= 0) {
			throw new Exception("i chilometri da percorrere non possono essere minori di 0");
		}
		
		this.numKm = numKm;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) throws Exception {
		
		if (age <= 0) {
			throw new Exception("l'età non può essere minore di 0");
		}
		
		this.age = age;
	}
	
	
	public double getTicketPrice() {
		
		// CALCOLO IL PREZZO PIENO DEL BIGLIETTO
		double fullPrice = getNumKm() * PRICE_FOR_KM;
		
		// CONTROLLO SE L'UTENTE HA DIRITTO AD UNO SCONTO
		if (getAge() < 18) {
			
			// L'UTENTE HA DIRITTO AD UNO SCONTO PER MINORENNI
			double discount = fullPrice * MINORS_DISCOUNT / 100;
	
			fullPrice -= discount;
			
		} else if (getAge() >= 65) {
			
			// L'UTENTE HA DIRITTO AD UNO SCONTO PER OVER 65
			double discount = fullPrice * COVER_65_DISCOUNT / 100;
	
			fullPrice -= discount;
		}
		
		return fullPrice;
	}
	
	
	@Override
	public String toString() {
		
		return "\nChilometri da percorrere: " + getNumKm() + "km"
				+ "\nEtà passeggero: " + getAge() + " anni"
				+ "\nPrezzo biglietto totale: " + String.format("%.2f", getTicketPrice()) + "€";
	}
}
