package billing;

public class Customer {
    private String name;
    private String houseNumber;
    private double unitsConsumed;

    public Customer(String name, String houseNumber, double unitsConsumed) {
        this.name = name;
        this.houseNumber = houseNumber;
        this.unitsConsumed = unitsConsumed;
    }

    public double calculateBill(){
        double bill = 0;
        double remainingUnits = 0;
        if(this.unitsConsumed <= 10){
            bill = 10 * this.unitsConsumed;
        }else if(this.unitsConsumed <= 30){
            remainingUnits = this.unitsConsumed - 10;
            bill = (remainingUnits * (250.0/20.0)) + 100;
        }else{
            remainingUnits = this.unitsConsumed - 20 - 10;
            bill = (remainingUnits * 2) + 100 + 250;
        }
        return bill;
    }

}
