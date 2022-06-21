package homework.oop_homework;

public class DiscountRate {
    private static double serviceDiscountPremium = 0.2;
    private static double serviceDiscountGold = 0.15;
    private static double serviceDiscountSilver = 0.1;
    private static double productDiscountPremium = 0.1;
    private static double productDiscountGold = 0.1;
    private static double productDiscountSilver = 0.1;

    public static double getServiceDiscountRate(String memberType) {
        if (memberType == "Premium") {
            return serviceDiscountPremium;
        } else if (memberType == "Gold") {
            return serviceDiscountGold;
        } else if (memberType == "Silver") {
            return serviceDiscountSilver;
        } else return 0.0;
    }

    public static double getProductDiscountRate(String memberType) {
        if (memberType == "Premium") {
            return productDiscountPremium;
        } else if (memberType == "Gold") {
            return productDiscountGold;
        } else if (memberType == "Silver") {
            return productDiscountSilver;
        } else return 0.0;
    }
}

