package com.example.calculator;

import org.springframework.web.bind.annotation.*;

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
    public String plus(@RequestParam(required = false) String num1, @RequestParam(required = false) String num2) {
        return String.format("Результат сложения = %s", calculatorService.plus(num1, num2));
    }

    @GetMapping("/minus")
    public String minus(@RequestParam(required = false) String num1, @RequestParam(required = false) String num2) {
        return String.format("Результат вычитания = %s", calculatorService.minus(num1, num2));
    }

    @GetMapping("/multiply")
    public String multiply(@RequestParam(required = false) String num1, @RequestParam(required = false) String num2) {
        return String.format("Результат умножения = %s", calculatorService.multiply(num1, num2));
    }

    @GetMapping("/divide")
    public String divide(@RequestParam(required = false) String num1, @RequestParam(required = false) String num2) {
        return String.format("Результат деления = %.2f", calculatorService.divide(num1, num2));
    }

    @ExceptionHandler({IllegalArgumentException.class})
    public String error (RuntimeException e) {
        return e.getMessage();
    }


}
