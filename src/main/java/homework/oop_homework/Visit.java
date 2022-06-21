package homework.oop_homework;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@ToString

public class Visit {
    @Getter
    private Customer customer;
    private Date date;

    @Setter
    private double serviceExpense;

    @Setter
    private double productExpense;


    public Visit(Customer customer, Date date) {
        this.customer = customer;
        this.date = date;
    }

    public String getCostumer() {
        return customer.getName();
    }

    public double getServiceExpense() {
        return serviceExpense - (serviceExpense * DiscountRate.getServiceDiscountRate(customer.getMemberType()));
    }

    public double getProductExpense() {
        return productExpense - (productExpense * DiscountRate.getProductDiscountRate(customer.getMemberType()));
    }

    public double getTotalExpense() {
        return getServiceExpense() + getProductExpense();
    }
}

