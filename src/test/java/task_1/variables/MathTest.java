package task_1.variables;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MathTest {

    private Math math;

    @BeforeEach
    public void setup() {
        math = new Math();
    }

    @Test
    @DisplayName("Check sum to integer")
    public void checkSum() {
        int firstInt = 4;
        int secondInt = 5;

        int result = math.plus(firstInt,secondInt);

        assertEquals(firstInt + secondInt, result);
    }

    @Test
    @DisplayName("Check minus to integer")
    public void checkMinus() {
        int firstInt = 4;
        int secondInt = 5;

        int result = math.minus(firstInt,secondInt);

        assertEquals(firstInt - secondInt, result);
    }

    @Test
    @DisplayName("Check multiple to integer")
    public void checkMultiple() {
        int firstInt = 4;
        int secondInt = 5;

        int result = math.multiple(firstInt,secondInt);

        assertEquals(firstInt * secondInt, result);
    }

    @Test
    @DisplayName("Check divide to integer")
    public void checkDivide() {
        int firstInt = 100;
        int secondInt = 5;

        int result = math.divide(firstInt,secondInt);

        assertEquals(firstInt / secondInt, result);
    }

}