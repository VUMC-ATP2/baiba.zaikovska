package homework;

public class FirstClass {
    public static void main(String[] args) {
//Country Description

        String countryName = "Japan";
        int populationNumber = 125502000;
        int areaNumber = 377975;
        String capital = "Tokyo";
        String officialLanguage = "Japanese";
        boolean isMemberOfEu = false;
        char currency = '¥';

        System.out.println(countryName + " is an island country in East Asia in the northwest Pacific Ocean.");
        System.out.printf("Population of %s is %d people and area is %d square kilometers.\n", countryName, populationNumber, areaNumber);
        System.out.println("The capital of " + countryName + " is " + capital + ".");
        System.out.printf("Official language is %s and currency is Japanese Yen (%s).\n", officialLanguage, currency);
        System.out.println("Is it a member of European Union, you ask?");
        if (isMemberOfEu) {
            System.out.println("Yes, it is.");
        } else {
            System.out.println("No, it is not.");
        }

        //Arithmetic operators
        // +
        int a = 5;
        int b = 12;
        int c = a + 2;
        System.out.println(a + b - c);

        // -
        float x = 13.8f;
        int y = 20;
        float w = (y - x);
        System.out.println(w);

        // /
        int totalDistanceTraveled = 268;
        double totalTimeTaken = 2.55d;
        double averageSpeed = totalDistanceTraveled/totalTimeTaken;
        System.out.printf("Average speed is %.2f\n", averageSpeed);

        // *
        int numberOfChildren = 18;
        int pairsOfShoesPerChild = 3;
        System.out.println("Total number of shoes in the kindergatden: " + numberOfChildren*pairsOfShoesPerChild);



    }
}
