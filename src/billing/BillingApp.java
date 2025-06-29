package billing;

public class BillingApp {
    public double calculateBill(double units){
        double bill = 0;
        double remainingUnits = 0;
        if(units <= 10){
                bill = 10 * units;
        }else if(units <= 30){
            remainingUnits = units - 10;
            bill = (remainingUnits * (250.0/20.0)) + 100;
        }else{
            remainingUnits = units - 20 - 10;
            bill = (remainingUnits * 2) + 100 + 250;
        }
        return bill;
    }

    public static void main(String[] args) {
        BillingApp check = new BillingApp();
        System.out.println(check.calculateBill(5));
        System.out.println(check.calculateBill(20));
        System.out.println(check.calculateBill(80));
        System.out.println(check.calculateBill(65));
    }
}
