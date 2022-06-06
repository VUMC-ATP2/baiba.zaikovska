package homework;

import java.util.Arrays;
import java.util.Scanner;

public class LoopHomeWork {
    public static void main(String[] args) {
        //1. uzdevums
        Scanner scanner = new Scanner(System.in);
        int a;
        int sum = 0;
        while (sum < 100) {
            System.out.println("Please enter a number: ");
            a = scanner.nextInt();
            sum = a + sum;
        }
        System.out.println("Ready!");

//        //2. uzdevums
        int x = 219;
        int count = 0;
        for (int i = 2; i < x; i++) {
            if (x % i == 0) {
                count++;
            }
        }
        if (count == 2) {
            System.out.println("It's a prime number");
        } else {
            System.out.println("It's not a prime number");
        }
        //3. uzdevums
        int[] numberOfMonths = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        String[] petNames = {"Cat", "Dog", "Hamster", "Ferret"};
        char[] countryName = {'L', 'A', 'T', 'V', 'I', 'A'};

        //while
        int month = 0;
        while (month < 12) {
            System.out.println(numberOfMonths[month]);
            month++;
        }
        int name = 0;
        while (name < petNames.length) {
            System.out.println(petNames[name]);
            name++;
        }
        int letter = 0;
        while (letter < countryName.length) {
            System.out.println(countryName[letter]);
            letter++;
        }
        //do while
        do {
            System.out.println(numberOfMonths[month]);
            month++;
        } while (month < numberOfMonths.length);
        do {
            System.out.println(petNames[name]);
            name++;
        } while (name < 4);
        do {
            System.out.println(countryName[letter]);
            letter++;
        } while (letter < countryName.length);
        //for loop
        for (month = 0; month < 12; month++) {
            System.out.println(numberOfMonths[month]);
        }
        for (name = 0; name < petNames.length; name++) {
            System.out.println(petNames[name]);
        }
        for (letter = 0; letter <= 5; letter++) {
            System.out.println(countryName[letter]);
        }
        //for each
        for (int months : numberOfMonths) {
            System.out.println(months);
        }
        for (String pets : petNames) {
            System.out.println(pets);
        }
        for (char letters : countryName) {
            System.out.println(letters);
        }
        //4. uzdevums
        int[] numArray = new int[100];
        for (int i = 0; i < numArray.length; i++) {
            numArray[i] = i * 2;
        }
        System.out.println(Arrays.toString(numArray));

        //5. uzdevums
        int number = 16;
        int factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial = factorial * i;
        }
        System.out.println("Factorial of " + number + ": " + factorial);

        //6. uzdevums
        int attempts = 1;
        int correctPin = 3142;
        System.out.println("Please enter PIN: ");
        int enteredPin = scanner.nextInt();
        while (enteredPin != correctPin && attempts < 3) {
            System.out.println("Nepareizs PIN, mēģiniet vēlreiz!");
            enteredPin = scanner.nextInt();
            attempts++;
        }
        if (enteredPin == correctPin && attempts <= 3) {
            System.out.println("PIN ir pieņemts, laipni lūdzam atpakaļ!");
        } else {
            System.out.println("Atvainojiet, bet jūs esat bloķēts!");
        }
    }
}







