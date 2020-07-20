package chapter9;

import chapter6.Month;

public class InheritanceTester {

    public static void main(String[] args){

//        Mother mom = new Mother();
//        mom.setName("Glenda");
//
//        System.out.println(mom.getName() + " is a " + mom.getGender());

        Cake cake = new Cake("chocolate");
        cake.setPrice(29.99);
        System.out.println("Cake flavor: " + cake.getFlavor());
        System.out.println("Cake price: " + cake.getPrice());

        BirthdayCake birthdayCake = new BirthdayCake();
        birthdayCake.setPrice(49.95);
        System.out.println("Birthday cake flavor: " + birthdayCake.getFlavor());
        System.out.println("Birthday cake price: " + birthdayCake.getPrice());

        WeddingCake weddingCake = new WeddingCake();
        weddingCake.setFlavor("piña colada");
        System.out.println("Wedding cake flavor: " + weddingCake.getFlavor());
        System.out.println("Wedding cake price: " + weddingCake.getPrice());
    }
}
