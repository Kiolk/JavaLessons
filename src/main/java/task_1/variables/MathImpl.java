package task_1.variables;

public class MathImpl implements IMath {

    public int plus(int a, int b) {
        return (a + b);
    }

    public int minus(int a, int b) {
        return (a - b);
    }

    public int multiple(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        return a / b;
        //throw new NotImplementedException();
    }
}
