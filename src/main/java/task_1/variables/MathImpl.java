package task_1.variables;

public class MathImpl implements IMath {

    public int plus(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public int minus(int a, int b) {
        int subtraction = a - b;
        return subtraction;
    }

    public int multiple(int a, int b) {
        int multiplication = a * b;
        return multiplication;
    }

    public int divide(int a, int b) {
        int division = a / b;
        return division;
        //throw new NotImplementedException();
    }
}
