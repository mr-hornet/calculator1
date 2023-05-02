package com.example.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {

    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping
    public String showHello() {
        return "Добро пожаловать в калькулятор!";
    }

    @GetMapping("/plus")
    public int plus(@RequestParam(required = false) int num1, @RequestParam(required = false) int num2) {
        return calculatorService.plus(num1, num2);
    }

    @GetMapping("/minus")
    public int minus(@RequestParam(required = false) int num1, @RequestParam(required = false) int num2) {
        return calculatorService.minus(num1, num2);
    }

    @GetMapping("/multiply")
    public int multiply(@RequestParam(required = false) int num1, @RequestParam(required = false) int num2) {
        return calculatorService.multiply(num1, num2);
    }

    @GetMapping("/divide")
    public int divide(@RequestParam(required = false) int num1, @RequestParam(required = false) int num2) {
        return calculatorService.divide(num1, num2);
    }
}
