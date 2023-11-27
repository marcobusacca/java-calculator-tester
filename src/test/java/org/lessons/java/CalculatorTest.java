package org.lessons.java;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class CalculatorTest {
	
	float num1 = 5;
	float num2 = 5;

	Calculator c = new Calculator();

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
    public void addTest() {
    	
    		assertEquals(num1 + num2, c.add(num1, num2), "Somma non riuscita");
    }
    
    @Test
    public void subtractTest() {
    	
    		assertEquals(num1 - num2, c.subtract(num1, num2), "Sottrazione non riuscita");
    }
    
    @Test
    public void divideTest() throws Exception {
    	
    		assertEquals(num1 / num2, c.divide(num1, num2), "Divisione non riuscita");
    }
    
    @Test
    public void multiplyTest() throws Exception {
    	
    		assertEquals(num1 * num2, c.multiply(num1, num2), "Moltiplicazione non riuscita");
    }
    
    @Test
    public void goodDivideNumbersTest() {
    	
    		assertDoesNotThrow(() -> c.divide(num1, num2), "Eccezione generata per il num2");
    }
    
    @Test
    public void badDivideNumbersTest() {
    	
    		assertThrows(Exception.class,
				() -> c.divide(num1, 0),
				"Non è stata lanciata un'eccezione per il num2 uguale a 0");
    }
}
