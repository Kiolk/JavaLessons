package task_1.variables;

import java.util.Random;

/**
 * In this class, the methods are checked
 */

public class Main {
    public static void main(String[] args) {

//        Math2Impl result = new Math2Impl();
//
//        GeneratorImpl a = new GeneratorImpl();
//        System.out.println(result.plus(a.generateRandomNumber(), a.generateRandomNumber()));// the sum of random numbers
//
//        System.out.println(result.minus(-100,-23));
//        System.out.println(result.divide(25,-5));
//        System.out.println(result.multiple(5,-10));
//
//        GeneratorImpl exampleInt = new GeneratorImpl(); // generates random integer with: new Random().nextInt()
//        System.out.println (exampleInt.generateRandomNumber());
//
//        Generator2Impl example = new Generator2Impl(); // Math.random() 0-100
//        System.out.println(example.generateRandomNumber());
//
//        GeneratorImpl randomWord = new GeneratorImpl();
//        System.out.println(randomWord.generateRandomWord());
//
//        GeneratorImpl b = new GeneratorImpl(); //Generates random integer within a specific range with Math.random()
//        System.out.print(b.generateRandomIntWithinSpecificRange(-100, -20));

        GeneratorImpl RandomName = new GeneratorImpl();
        System.out.println(RandomName.generateRandomName());

//        char[] alphabet = new char[]{'a','A','b','B','c','C'};
//        String stringFromCharArray= new String(charArray2);
//        for (int i = 0; i < alphabet.length; i++) {
//            System.out.print(alphabet[i]);
//            System.out.print(alphabet.charAt(r.nextInt(alphabet.length())));
//        }
    }
}

