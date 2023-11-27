package org.lessons.java;

import java.util.Scanner;

public class CalcolaBiglietto {

	public static void main(String[] args) {
		
		// AVVIO LO SCANNER SYSTEM.IN
		Scanner in = new Scanner(System.in);
	
		
		// CHIEDO I CHILOMETRI DA PERCORRERE ALL'UTENTE
		System.out.print("Chilometri da percorrere: ");
		String strKm = in.nextLine();
		int intKm = Integer.valueOf(strKm);
		
		// CHIEDO L'ETA DEL PASSEGGERO ALL'UTENTE
		System.out.print("Età passeggero: ");
		String strAge = in.nextLine();
		int intAge = Integer.valueOf(strAge);
		
		
		in.close();
		
		
		Ticket t = null;
		
		try {
			
			t = new Ticket(intKm, intAge);
			
			System.out.println(t);
			
		} catch (Exception e) {

			System.out.println(e.getMessage());
		}
	}
}
