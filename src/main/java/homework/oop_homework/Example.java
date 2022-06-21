package homework.oop_homework;

import java.util.Date;

public class Example {
    public static void main(String[] args) {
        Date date = new Date();
        Customer customer1 = new Customer("Linda");
        Visit visit = new Visit(customer1, date);
        System.out.println("Customer's name: " + customer1.getName() + "\nDate of the visit: " + date);
        visit.setServiceExpense(12);
        visit.setProductExpense(13);
        System.out.println("Total price for today: " + visit.getTotalExpense());

        Customer customer2 = new Customer("Zane", true, "Gold");
        Visit anotherVisit = new Visit(customer2, date);
        System.out.println("Customer's name: " + customer2.getName() + "\nDate of the visit: " + date);
        anotherVisit.setServiceExpense(15);
        anotherVisit.setProductExpense(22);
        System.out.println("Total price for today: " + anotherVisit.getTotalExpense());
        System.out.println("Total price for services only: " + anotherVisit.getServiceExpense());
        System.out.println("Total price for products only: " + anotherVisit.getProductExpense());

        Customer customer3 = new Customer("Juris");
        Visit visit3 = new Visit(customer3, date);
        System.out.println("Customer's name: " + customer3.getName() + "\nDate of the visit: " + date);
        customer3.setMember(true);
        customer3.setMemberType("Silver");
        visit3.setServiceExpense(38);
        visit3.setProductExpense(0);
        System.out.println("Total price for today: " + visit3.getTotalExpense());
    }
}
