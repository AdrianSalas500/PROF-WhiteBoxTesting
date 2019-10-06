package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class Test_foo2 {

	Exercises exercises=new Exercises();
	//caso 1 a=3 b=2
	@Test
	public void test_foo2caso1() {
		float a= 3.0f;
		float b= 2.0f;
		float result= 2.0f;
		
		assertEquals(result, exercises.foo2(a, b));
	}
	//caso 2 a=2 b=3
	@Test
	public void test_foo2_caso2() {
		float a= 2.0f;
		float b= 3.0f;
		float result= 2.0f;
		
		assertEquals(result, exercises.foo2(a, b));
	}
	//caso 3 a=2 b=3
	@Test
	public void test_foo2_caso3() {
		float a= -5.0f;
		float b= 2.0f;
		float result= (float) -1.5f;
		
		assertEquals(result, exercises.foo2(a, b));
	}
	
}
