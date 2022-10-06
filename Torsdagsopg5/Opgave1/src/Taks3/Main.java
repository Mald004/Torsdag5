package Taks3;

import java.util.ArrayList;

public class Main {
    public static ArrayList<Customer> customers = new ArrayList<>();
    public static void main(String[] args) {

        // Laver instanser af customer
        Customer customer1 = new Customer("Malde","Frank","dude");
        Customer customer2 = new Customer("Hans","Dans","yeyea");
        Customer customer3 = new Customer("Bo","hobro","Unicorn");
        Customer customer4 = new Customer("Ulrik","Spand","Vandmanden");
        Customer customer5 = new Customer("Henriette","Spætte","Frøen");
        Customer customer6 = new Customer("Lise","Thiese","Flise");

        //Adder instanser til array
        customers.add(customer1);
        customers.add(customer2);
        customers.add(customer3);
        customers.add(customer4);
        customers.add(customer5);
        customers.add(customer6);
printcustomers(customers);


    }
    public static void printcustomers(ArrayList<Customer> customers) {
        for (Customer customer : customers) {
            System.out.println(customer);
        }
    }
}
