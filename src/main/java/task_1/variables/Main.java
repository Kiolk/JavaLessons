package task_1.variables;

/**
 * In this class, the methods are checked
 */

public class Main {
    public static void main(String[] args) {

        Math2Impl result = new Math2Impl();

        GeneratorImpl a = new GeneratorImpl();
        System.out.println(result.plus(a.generateRandomNumber(), a.generateRandomNumber()));// the sum of random numbers

        System.out.println(result.minus(100,-23));
        System.out.println(result.divide(25,-5));
        System.out.println(result.multiple(-5,-10));

        GeneratorImpl exampleInt = new GeneratorImpl(); // generates random integer with: new Random().nextInt()
        System.out.println (exampleInt.generateRandomNumber());

        Generator2Impl example = new Generator2Impl(); // Math.random() 0-100
        System.out.println(example.generateRandomNumber());

        GeneratorImpl randomString = new GeneratorImpl();
        System.out.println(randomString.generateRandomWord());

        GeneratorImpl b = new GeneratorImpl(); //Generates random integer within a specific range with Math.random()
        System.out.print(b.generateRandomIntWithinSpecificRange(-100, -20));

    }
}

