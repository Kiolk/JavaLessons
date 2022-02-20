package task_1.variables;

import java.lang.*;

public class Math2Impl implements IMath {

    @Override
    public int plus(int a, int b) {
        int sum = Integer.sum(a, b);
        return sum;
    }

    @Override
    public int minus(int a, int b) {
        int subtr = Math.subtractExact(a, b);
        return subtr;
    }

    @Override
    public int multiple(int a, int b) {
        int multiplication = Math.multiplyExact(a, b);
        return multiplication;
    }

    @Override
    public int divide(int a, int b) {
        int division = Math.floorDiv(a, b);
        return division;
    }
}
