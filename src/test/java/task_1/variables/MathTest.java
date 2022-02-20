package task_1.variables;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MathTest {

    private IMath math;

    @BeforeEach
    public void setup() {
        math = new Math2Impl();
    }

    @Test
    @DisplayName("Check sum to integer")
    public void checkSum() {
        int firstInt = new Random().nextInt();
        int secondInt = new Random().nextInt();

        int result = math.plus(firstInt, secondInt);

        assertEquals(firstInt + secondInt, result);
    }

    @Test
    @DisplayName("Check minus to integer")
    public void checkMinus() {
        int firstInt = new Random().nextInt();
        int secondInt = new Random().nextInt();

        int result = math.minus(firstInt, secondInt);

        assertEquals(firstInt - secondInt, result);
    }

    @Test
    @DisplayName("Check multiple to integer")
    public void checkMultiple() {
        int firstInt = new Random().nextInt();
        int secondInt = new Random().nextInt();

        int result = math.multiple(firstInt, secondInt);

        assertEquals(firstInt * secondInt, result);
    }

    @Test
    @DisplayName("Check divide to integer")
    public void checkDivide() {
        int firstInt = new Random().nextInt();
        int secondInt = new Random().nextInt();

        int result = math.divide(firstInt, secondInt);

        assertEquals(firstInt / secondInt, result);
    }

}