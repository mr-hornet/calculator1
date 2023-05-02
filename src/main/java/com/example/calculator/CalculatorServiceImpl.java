package com.example.calculator;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {

    @Override
    public int plus(String num1, String num2) {
        if (num1 == null || num2 == null) {
            throw new IllegalArgumentException("Нету одного параметра");
        }
        return Integer.parseInt(num1) + Integer.parseInt(num2);
    }

    @Override
    public int minus(String num1, String num2) {
        if (num1 == null || num2 == null) {
            throw new IllegalArgumentException("Нету одного параметра");
        }
        return Integer.parseInt(num1) - Integer.parseInt(num2);
    }

    @Override
    public int multiply(String num1, String num2) {
        if (num1 == null || num2 == null) {
            throw new IllegalArgumentException("Нету одного параметра");
        }
        return Integer.parseInt(num1) * Integer.parseInt(num2);
    }

    @Override
    public double divide(String num1, String num2) {
        if (num1 == null || num2 == null) {
            throw new IllegalArgumentException("Нету одного параметра");
        }
        if (Integer.parseInt(num2) != 0) {
            return (double) Integer.parseInt(num1) / Integer.parseInt(num2);
        }
        throw new IllegalArgumentException("Делить на ноль нельзя");
    }

}
