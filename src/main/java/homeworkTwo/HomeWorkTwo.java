package homeworkTwo;

import java.util.Scanner;

public class HomeWorkTwo {
    public static void main(String[] args) {
        //1. uzdevums
        int x = 12;
        System.out.println(x > 0);

        x = 14;
        System.out.println(x < 0);

        x = 7;
        boolean result = x > 5 && x <= 10;
        System.out.println(result);

        x = 8;
        result = !(x <= 5) && x < 10;
        System.out.println(result);

        x = 6;
        result = x == 0 || x == 10;
        System.out.println(result);

        x = 4;
        result = (x * x) > 10;
        System.out.println(result);

//        //2. uzdevums
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number from 1 to 12: ");
        int inputResult = scanner.nextInt();
        switch (inputResult){
            case 1:
                System.out.println("It's January.");
                break;
            case 2:
                System.out.println("It's February,");
                break;
            case 3:
                System.out.println("It's March.");
                break;
            case 4:
                System.out.println("It's April.");
                break;
            case 5:
                System.out.println("It's May.");
                break;
            case 6:
                System.out.println("It's June");
                break;
            case 7:
                System.out.println("It's July.");
                break;
            case 8:
                System.out.println("It's August.");
                break;
            case 9:
                System.out.println("It's September.");
                break;
            case 10:
                System.out.println("It's October.");
                break;
            case 11:
                System.out.println("It's November.");
                break;
            case 12:
                System.out.println("It's December.");
                break;
            default:
                System.out.println("Number is incorrect!");
        }
        //3. uzdevums

        System.out.println("Please enter the first number: ");
        int inputResult1 = scanner.nextInt();
        System.out.println("Please enter the second number: ");
        int inputResult2 = scanner.nextInt();
        System.out.println("Please enter the third number: ");
        int inputResult3 = scanner.nextInt();
        if (inputResult1 > inputResult2 && inputResult1 > inputResult3){
            System.out.println("The first is your biggest number.");
        } else if (inputResult2 > inputResult1 && inputResult2 > inputResult3) {
            System.out.println("The second is your biggest number.");
            } else if (inputResult3 > inputResult1 && inputResult3 > inputResult2) {
            System.out.println("The third is your biggest number.");
        } else System.out.println("Your numbers are incorrect.");

        //4. uzdevums
        //šim 2 varianti, jo sākumā nesapratu mājasdraba failā minēto piemēru, bet, taisot switchu, laikam sapratu
        String colour = "Yellow";
        switch (colour) {
            case "Red":
                System.out.println("Stop!");
                break;
            case "Yellow":
                System.out.println("Wait!");
                break;
            case "Green":
                System.out.println("Go!");
                break;
            default:
                System.out.println("Please use your best judgement!");
        }

        if (colour.equals("Red")) {
            System.out.println("Stop!");
        } else if (colour.equals("Yellow")) {
            System.out.println("Wait!");
        } else if (colour.equals("Green")) {
            System.out.println("Go!");
        } else System.out.println("Please use your best judgement!");

        //5. uzdevums
        printBusinessCard("Līga", "Liepa", 35, "+371 22344587", 1987);
        printBusinessCard("Līga", "Liepa", 35, "+371 22344587", 1987);
        printBusinessCard("Līga", "Liepa", 35, "+371 22344587", 1987);

        //6. uzdevums
        printBusinessCardTwo("Līga", "Liepa", 35, "+371 22344587", 1987);
        printBusinessCardTwo("Juris","Ozols", 30, "+371 25698721", 1992);

        //7. uzdevums
        int summa = sumOfTwoNumbers(12, 13);
        System.out.println(summa);

        //8. uzdevums
        System.out.println(average(2.15d,15.04d, 3.18));
    }
    public static void printBusinessCard(String name, String surname, int age, String phone, int birthYear){
        System.out.printf("BUSINESS CARD\n############\nName: %s\nSurname: %s\nAge: %d\nPhone: %s\nYear of Birth: %d\n", name, surname, age, phone, birthYear);
    }
public static void printBusinessCardTwo(String name, String surname, int age, String phone, int birthYear){
    System.out.printf("BUSINESS CARD\n############\nName: %s\nSurname: %s\nAge: %d\nPhone: %s\nYear of Birth: %d\n", name, surname, age, phone, birthYear);
}
public static int sumOfTwoNumbers(int a, int b){
        return a + b;
}
public static double average(double x, double y, double w){
    return (x + y + w)/3;
}
}


