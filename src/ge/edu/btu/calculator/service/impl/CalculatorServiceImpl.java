package ge.edu.btu.calculator.service.impl;

public class CalculatorServiceImpl implements CalculatorService {


    @Override
    public int sum(int x, int y) {
        return x+y;
    }

    @Override
    public int divide(int x, int y) {

        int result = -1;

        try {
            result = x/y;
        } catch (ArithmeticException e) {
            System.out.println(e);
        }

        return result;


    }

    @Override
    public double sum(double x, double y) {

        return x+y;
    }

    @Override
    public double divide(double x, double y) {



        double result = -1;

        try {
            result = x/y;
        } catch (ArithmeticException e) {
            System.out.println(e);
        }

        return result;
    }
}
