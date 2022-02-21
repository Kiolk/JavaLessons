package task_1.variables;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.nio.charset.Charset;
import java.util.Random;

public class Generator2Impl implements IGenerator {

    public int generateRandomNumber() {
        double random = Math.random();
        double c = random * 100; // random int range from 0  to 100(?).
        return (int) Math.round(c); // rounding to an integer.
    }

    public int generateRandomIntWithinSpecificRange(int min, int max) { //Generates random integer within specific range with Random class.
        Random random = new Random();
        return random.ints(min, max)
                .findFirst()
                .getAsInt();
    }

    public String generateRandomWord() { // solution from internet.
        byte[] array = new byte[12]; // length is bounded by 12.
        new Random().nextBytes(array);
        return new String(array, Charset.forName("UTF-8"));
    }

    public String generateRandomName() {

        //   return "Wer";
        //TODO implement logic for generate random word what is similar to name. Start from capital later, length min 3 later, min one vowels and max 3 consonants in row
        throw new NotImplementedException();
    }
}
