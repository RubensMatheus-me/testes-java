package org.example.services;

import org.junit.Test;
import static org.junit.Assert.*;

public class IRPFServiceTest {
    IRPFService service = new IRPFService();

    @Test
    public void testNoTax() {
        assertEquals(0.0, service.calculateTax(1500.00), 0.01);
    }

    @Test
    public void testTax7_5() {
        assertEquals(44.70, service.calculateTax(2500.00), 0.01);
    }

    @Test
    public void testTax15() {
        assertEquals(95.20, service.calculateTax(3000.00), 0.01);
    }

    @Test
    public void testTax22_5() {
        assertEquals(263.87, service.calculateTax(4000.00), 0.01);
    }

    @Test
    public void testTax27_5() {
        assertEquals(1055.64, service.calculateTax(7000.00), 0.01);
    }

    //invalid tests

    @Test
    public void testNegativeSalary() {
        double result = service.calculateTax(-5000.00);
        assertEquals("Salário negativo", 0.0, result, 0.01);
    }

    @Test
    public void testZeroSalary() {
        assertEquals(0.0, service.calculateTax(0.0), 0.01);
    }
}
