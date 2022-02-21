package task_1.variables;

import java.lang.*;

public class Math2Impl implements IMath {

    @Override
    public int plus(int a, int b) {
        return Integer.sum(a, b);
    }

    @Override
    public int minus(int a, int b) {
//        return (a - b);
        return Math.subtractExact(a, b);
    }

    @Override
    public int multiple(int a, int b) {
//        return a * b;
        return Math.multiplyExact(a, b);
    }

    @Override
    public int divide(int a, int b) {
//        return a / b;
        return Math.floorDiv(a, b);
    }
}
