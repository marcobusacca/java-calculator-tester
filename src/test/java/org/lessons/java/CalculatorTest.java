package org.lessons.java;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

public class CalculatorTest {

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
}
