package Practical_5;

public class CalculatorServiceImpl implements CalculatorService {


    @Override
    public double sum(int x, int y) {
        return x + y;
    }

    @Override
    public double prod(int num1, int num2) {
        return num1 * num2;
    }
}
