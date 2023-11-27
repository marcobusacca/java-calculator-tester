package org.lessons.java;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TicketTest {
	
	@BeforeAll
	public static void setup() {
	    // eseguito una volta
	    // prima di tutti i metodi di test
	}
	
	@BeforeEach
	public void init() {
	    // eseguito prima di ogni metodo di test
	}
	
	@AfterEach
	public void clear() {
	    // eseguito dopo ogni metodo di test
	}
	
	@AfterAll
	public static void cleanup() {
	    // eseguito una volta
	    // dopo di tutti i metodi di test
	}
	
	@Test
	public void testNegativeKm() {
		assertThrows(Exception.class,
				() -> new Ticket(-100, 20),
				"Non è stata lanciata un'eccezione per i km negativi");
	}
	
	@Test
	public void testNegativeAge() {
		assertThrows(Exception.class,
				() -> new Ticket(100, -20),
				"Non è stata lanciata un'eccezione per l'età negativa");
	}
	
	@Test
	public void testFullPrice() throws Exception {
		
		Ticket t = new Ticket(100, 20);
		
		assertEquals(21, t.getTicketPrice(), "il prezzo pieno senza sconti è stato calcolato male");
	}
	
	@Test
	public void testUnder18Price() throws Exception {
		
		Ticket t = new Ticket(100, 16);
		
		assertEquals(16.80, t.getTicketPrice(), "il prezzo pieno con sconto under 18 è stato calcolato male");
	}
	
	@Test
	public void testOver65Price() throws Exception {
		
		Ticket t = new Ticket(100, 70);
		
		assertEquals(12.60, t.getTicketPrice(), "il prezzo pieno con sconto over 65 è stato calcolato male");
	}
}
