package task_1.variables.epamTasks;

import java.util.Arrays;
import java.util.Scanner;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Util.println;

public class EpamTasksVarB_Methods {

    public void toGreetUsingName() {
        System.out.println("Enter your name: ");
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        System.out.println("Welcome, " + name);
    }

    //TODO вывести заданное количество случайных чисел с переходом и без на новую строку
    public void generateRandomNumbers() {
        System.out.println("Enter a quantity of random numbers: ");
        Scanner scan = new Scanner(System.in);
        int quantityNumbers = scan.nextInt();

        for (int i = 1; i <= quantityNumbers; i++) {
            double x = Math.random();
            System.out.println(x); // с переходом.
        }
        for (int i = 1; i <= quantityNumbers; i++) {
            System.out.print(Math.random() + "  "); //без перехода.
        }
        System.out.println();
    }

    //TODO ввести пароль из командной строки и сравнить с образцом.
    //я сделал ввод через консоль
    public void checkPassword() {
        String truePassword = "Password123";
        System.out.println("\nEnter the password: ");
        Scanner scan = new Scanner(System.in);
        String newPassword = scan.nextLine();
        if (truePassword.equals(newPassword)) {
            System.out.println("Password is correct\n");
        } else {
            System.out.println("Wrong password\n");
        }
    }

    //TODO ввести с консоли n целых чисел.
    public int[] createIntegersArray() {
        System.out.println("Enter the number of integers of your array: ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println("Enter " + n + " integers: ");

        int[] array1 = new int[n];
        for (int i = 0; i < array1.length; i++) {
            array1[i] = scan.nextInt();
        }
        System.out.println("Your array: " + Arrays.toString(array1));
        return array1;
    }

    // TODO вывести на консоль четные числа из массива, созданного в методе createIntegersArray()
    public void outputEvenIntegers(int[] array) {
        int evenQuantity = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                evenQuantity++;
            }
        }
        int[] evenArray = new int[evenQuantity];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                evenArray[index] = array[i];
                index++;
            }
        }
        println("Even numbers: " + Arrays.toString(evenArray));
    }

    // TODO вывести на консоль нечетные числа из массива, созданного в методе createIntegersArray()
    public void outputOddIntegers(int[] array) {
        int oddQuantity = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                oddQuantity++;
            }
        }
        int[] oddArray = new int[oddQuantity];
        int index2 = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                oddArray[index2] = array[i];
                index2++;
            }
        }
        println("Odd numbers: " + Arrays.toString(oddArray));
    }

    //TODO Output the smallest array integer to the console.
    public void outputMinInt(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("The smallest integer of array is: " + min);
    }

    //TODO Output the biggest array integer to the console.
    public void outputMaxInt(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("The biggest integer of array is: " + max);
    }

    //TODO Output integers of array that are divisible by three or by nine.
    public void outputIntDivByThreeOrNine(int[] array) {
        int quantityIntDivByThreeOrNine = 0;
        for (int i = 0; i < array.length; i++) {
            if ((array[i] % 3 == 0) || (array[i] % 9 == 0)) {
                quantityIntDivByThreeOrNine++;
            }
        }
        int[] arrayIntDivByThreeOrNine = new int[quantityIntDivByThreeOrNine];
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if ((array[i] % 3 == 0) || (array[i] % 9 == 0)) {
                arrayIntDivByThreeOrNine[counter] = array[i];
                counter++;
            }
        }
        System.out.println("Integers that are divisible by three or nine: " + Arrays.toString(arrayIntDivByThreeOrNine));
    }

    //TODO Output integers of array that are divisible by five and seven.
    public void outputIntDivByFiveAndSeven(int[] array) {
        int quantityIntDivByFiveAndSeven = 0;
        for (int i = 0; i < array.length; i++) {
            if ((array[i] % 5 == 0) && (array[i] % 7 == 0)) {
                quantityIntDivByFiveAndSeven++;
            }
        }
        int[] arrayIntDivByFiveAndSeven = new int[quantityIntDivByFiveAndSeven];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if ((array[i] % 5 == 0) && (array[i] % 7 == 0)) {
                arrayIntDivByFiveAndSeven[index] = array[i];
                index++;
            }
        }
        System.out.println("Integers that are divisible by five and seven: " + Arrays.toString(arrayIntDivByFiveAndSeven));
    }

    // TODO Bubble sort descending.
    public void bubbleSortDescending(int[] array) {
        boolean isSorted = false;
        int buf;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] < array[i + 1]) {
                    isSorted = false;

                    buf = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = buf;
                }
            }
        }
        System.out.println("Sorted array: " + Arrays.toString(array));
    }
}


