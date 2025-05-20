package org.example.services;

public class IRPFService {
    public double calculateTax(double salary) {
        if(salary <= 1903.98) {
            return 0.0;
        } else if (salary <= 2826.65) {
            return salary * 0.075 - 142.80;
        } else if (salary <= 3751.05) {
            return salary * 0.15 - 354.80;
        } else if (salary <= 4664.68) {
            return salary * 0.225 - 636.13;
        } else {
            return salary * 0.275 - 869.36;
        }
    }
}
