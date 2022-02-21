package task_1.variables;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.Random;

public class GeneratorImpl implements IGenerator {

    public int generateRandomNumber() {
        return new Random().nextInt();
    }

    public int generateRandomIntWithinSpecificRange(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }

    public String generateRandomWord() { // solution from internet

        int leftLimit = 97; // letter 'a'
        int rightLimit = 122; // letter 'z'
        int targetStringLength = 55;
        Random random = new Random();
        StringBuilder buffer = new StringBuilder(targetStringLength);
        for (int i = 0; i < targetStringLength; i++) {
            int randomLimitedInt = leftLimit + (int)
                    (random.nextFloat() * (rightLimit - leftLimit + 1));
            buffer.append((char) randomLimitedInt);
        }
        return buffer.toString();
    }

    public String generateRandomName() {
        //   return "Wer";
        //TODO implement logic for generate random word what is similar to name. Start from capital later, length min 3 later, min one vowels and max 3 consonants in row
        throw new NotImplementedException();
    }
}
