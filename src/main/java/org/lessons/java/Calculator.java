package org.lessons.java;

public class Calculator {

	public float add(float num1, float num2) {
		
		return num1 + num2;
	}
	public float subtract(float num1, float num2) {
		
		return num1 - num2;
	}
	public float divide(float num1, float num2) throws Exception {
		
		if (num2 == 0) {
			throw new Exception("non puoi dividere per zero");
		}
		
		return num1 / num2;
	}
	public float multiply(float num1, float num2) {
		
		return num1 * num2;
	}
}
