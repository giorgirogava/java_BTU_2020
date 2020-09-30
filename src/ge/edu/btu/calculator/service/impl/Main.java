package ge.edu.btu.calculator.service.impl;

public class Main {

    public static void main(String[] args) {


        CalculatorServiceImpl calculatorService = new CalculatorServiceImpl();

        System.out.println("-1 shows exception\n\n");
        System.out.println("Sum (int) : " + calculatorService.sum(3, 78));
        System.out.println("Division (int): " + calculatorService.divide(56, 0));
        System.out.println("Sum (double): " + calculatorService.sum(25.90, 14.76));
        System.out.println("Division (double): " + calculatorService.divide(13.13, 9.51));
        System.out.println("Division (double): " + calculatorService.divide(13.13, 0));



    }
}
