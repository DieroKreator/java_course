package chapter6.phoneBillCalculatorV2;

/*
 * PHONE BILL CALCULATOR
 * Object-oriented Phone Bill exercise
 */

public class PhoneBill {

    private int id;
    private double baseCost;
    private int allocatedMinutes;
    private int minutesUsed;

    public PhoneBill() {
        id = 0;
        baseCost = 79.99;
        allocatedMinutes = 800;
        minutesUsed = 800;
    }

    public PhoneBill(int id) {
        this.id = id;
        baseCost = 79.99;
        allocatedMinutes = 800;
        minutesUsed = 800;
    }

    public PhoneBill(int id, double baseCost, int allocatedMinutes, int minutesUsed) {

        setId(id);
        setBaseCost(baseCost);
        setAllocatedMinutes(allocatedMinutes);
        setMinutesUsed(minutesUsed);
    }

    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }

    public double getBaseCost(){
        return id;
    }
    public void setBaseCost(double baseCost){
        this.baseCost = baseCost;
    }

    public int getAllocatedMinutes(){
        return allocatedMinutes;
    }
    public void setAllocatedMinutes(int minutes){
        this.allocatedMinutes = allocatedMinutes;
    }

    public int getMinutesUsed(){
        return minutesUsed;
    }
    public void setMinutesUsed(int minutes){
        this.minutesUsed = minutesUsed;
    }

    double calculateOverage() {
        if(minutesUsed <= allocatedMinutes){
            return 0;
        }

        double overageRate = .25;
        double overageMinutes = minutesUsed - allocatedMinutes;
        return overageMinutes * overageRate;
    }

    double calculateTax(){
        double taxRate = .15;
        return taxRate * (baseCost + calculateOverage());
    }

    public double calculateTotal(){
        return baseCost + calculateOverage() + calculateTax();
    }

    public void printItemizedBill(){
        System.out.println("ID: " + id);
        System.out.println("Base Rate: $" + baseCost);
        System.out.println("Overage Fee: $" + String.format("%.2f", calculateOverage()));
        System.out.println("Tax: $" + String.format("%.2f", calculateTax()));
        System.out.println("Total: $" + String.format("%.2f", calculateTotal()));
    }
}
