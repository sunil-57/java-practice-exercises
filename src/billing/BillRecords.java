package billing;

import java.util.ArrayList;

public class BillRecords {
    private static ArrayList<BillRecords> billRecordsList = new ArrayList<>();
    //customer ko details
    // {customer details, bill amount, billing date}
    //TODO show highest paying customer
    private Customer customer;
    private double billAmount;
    //TODO print the bill
    //TODO jaile record add hunxa teti bela ko date chainxa
    private String billingDate;

    public BillRecords(Customer customer, double billAmount, String billingDate){
        this.customer = customer;
        this.billAmount = billAmount;
        this.billingDate = billingDate;
    }
    // add a customer
    public static boolean addBillRecord(BillRecords billRecords){
        boolean isRecordAdded = false;
        if(billRecordsList.add(billRecords)){
            isRecordAdded = true;
        }
        return isRecordAdded;
    }
}
