package chapter6.phoneBillCalculator;

public class PhoneBillCalculator {

    public static void main(String args[]) {

        PhoneBill phoneBill = new PhoneBill(123456);
        phoneBill.setMinutesUsed(1000);
        phoneBill.printItemizedBill();
    }
}
