package Practical_5;

public class Main {

    public static void main(String[] args) {

        CalculatorServiceImpl calculatorService = new CalculatorServiceImpl();
        double sumResult = calculatorService.sum(7, 4);
        double productResult = calculatorService.prod(5, 12);
        System.out.println(sumResult + "\n" + productResult);
    }
}
