package task_1.variables;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GeneratorTest {

    private IGenerator generator;

    @BeforeEach
    public void setup() {
        generator = new GeneratorImpl();
    }

    @Test
    @DisplayName("Random number generator")
    public void testRandomGenerator() {

        int firstInteger = generator.generateRandomNumber();
        int secondInteger = generator.generateRandomNumber();

        assertNotEquals(firstInteger, secondInteger);
    }

    @Test
    @DisplayName("Random integer within specific range generator")
    public void testRandomGeneratorWithinRange() {

        int firstInteger = generator.generateRandomIntWithinSpecificRange(-5, 30);
        int secondInteger = generator.generateRandomIntWithinSpecificRange(-5, 30);

        assertNotEquals(firstInteger, secondInteger);
    }

    @Test
    @DisplayName("Random string generator")
    public void testRandomStringGenerator() {

        String firstWord = generator.generateRandomWord();
        String secondWord = generator.generateRandomWord();

        assertNotEquals(firstWord, secondWord);
    }

    @Test
    @DisplayName("Random name generator. Start from capital")
    public void startGenerateNameFromCapital() {

        String name = generator.generateRandomName();
        char first = name.charAt(0);

        assertTrue(Character.isUpperCase(first));

        for (int i = 1; i < name.length(); ++i) {
            char charAt = name.charAt(i);
            assertFalse(Character.isUpperCase(charAt));
        }
    }

    @Test
    @DisplayName("Generate name length more 3 later")
    public void startGenerateNameMore3Later() {

        String name = generator.generateRandomName();

        assertTrue(name.length() >= 3);
    }

    @Test
    @DisplayName("Generate name with min one vowel")
    public void checkGenerateNameWithOneVowel() {
        int countVowel = 0;
        String name = generator.generateRandomName();

        for (int i = 0; i < name.length(); i++) {
            char charAt = name.charAt(i);
            if (charAt == 'a' || charAt == 'e' || charAt == 'i' || charAt == 'o'
                    || charAt == 'u' || charAt == 'A' || charAt == 'E' || charAt == 'I'
                    || charAt == 'O' || charAt == 'U') {
                countVowel++;
            }
        }

        assertTrue(countVowel >= 1);
    }

}