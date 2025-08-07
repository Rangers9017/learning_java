import java.util.Scanner;

public class func {
    public static void announceDEveloperTeaTime()
    {
        System.out.println("Tea time");
        System.out.println("type");
        Scanner input =new Scanner(System.in);
        input.next();
        System.out.println("tea time");
    }
    public static void main(String[] args)
    {
        announceDEveloperTeaTime();
        calculateTotalMealPrice(10, .20, .08);
       double group = calculateTotalMealPrice(25, .18, .08);
       System.out.println(group);
    }

    /*public static void calculateTotalMealPrice(double listedMealPrice,
                                                   double tipRate,
                                                   double taxRate) {
            double tip = tipRate * listedMealPrice;
            double tax = taxRate * listedMealPrice;
            double result = listedMealPrice + tip + tax;
            System.out.println("Your total meal price is " + result);
    }*/
    public static double calculateTotalMealPrice(double listedMealPrice,
                                               double tipRate,
                                               double taxRate) {
        double tip = tipRate * listedMealPrice;
        double tax = taxRate * listedMealPrice;
        double result = listedMealPrice + tip + tax;
        System.out.println("Your total meal price is " + result);
        return result;
    }

}
