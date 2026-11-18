import java.awt.desktop.AboutEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

public class   Main {

    /**
     * printFinalPrice
     * This method is going to determine the final price each customer is paying
     * @param Customer
     * @param price
     */

    public static void PrintFinalPrice(Discountable Customer, double price) {
        System.out.printf("You Pay:  GMD%.2f%n", Customer.applyDiscount(price));
    }

    public static void main (String[]args){
        // create new FoodTruck obj (object)
        FoodTruck truck = new FoodTruck();
        MenuItem item1 = new MenuItem("bread", 125, true);
        // add menu item to truck
        truck.addItem(item1);

        truck.printMenu();

       // creating VIP and Regular customer
       List<Customer> line =new ArrayList<>();
       line.add(new RegularCustomer("Lamin"));
       line.add(new RegularCustomer("Awa"));
       line.add(new VIPCustomer("Binta"));

       // Printing the priority of customers
        for (Customer c : line) {
            System.out.println(c .describe());
        }

        Customer next = line.get(0); // get the first customer from the line
        for (Customer c : line) {
            // check for a customer with a priority of 1
//            if(c.getpriority() > next.getPriority()) {
                next = c;

            }

        System.out.println();
        System.out.println("Serving " +next.getName());


        System.out.println("---------------------------------------");
        System.out.println("Checking prices for a Regular and VIP Customer");
        PrintFinalPrice(new RegularCustomer("Lamin"),   100);
        PrintFinalPrice(new VIPCustomer("Ida"), 100);

        }
    }

        /*
        bread 12
        berries 300
        pringles 350
        apple 30

         */
