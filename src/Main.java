import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        //QuickBite
        /*
        itemName: data type for this Array is Sring
        itemPrices: data type for this Array is double
        itemAvailable: data type for this Array is boolean
         */

        // Initialize your scanner obj
        Scanner in = new Scanner(System.in);

        // Items names, prices, and availability

        String[] itemName = {"bread", "berries", "pringles", "apple"};
        double[] itemPrices = {12, 200, 350, 30};
        boolean[] itemAvailable = {true, false, true, false};

        // add items to the Array using Scanner class/object

        do {
            System.out.println("Are you adding item?: Y or N"); // hint the user
            String userInput = in.next();

            if (userInput.equalsIgnoreCase("n")) break;
            System.out.print("Enter item name: ");
            String name = in.next();

            System.out.print("Enter item price: ");
            double price = in.nextDouble();


            System.out.println("Enter item status: ");
            boolean status = in.nextBoolean(); // true / false

            System.out.println("Name \t price \t status");
            System.out.println(name+ "\t" +price+ "\t" +status);


            // add new captured item to the store
            itemName = Arrays.copyOf(itemName,itemName.length+1);
            // Array is resized {"bread", "berries", "pringles", "apple", ""}
            itemName[itemName.length-1] = name;
            System.out.println(Arrays.toString(itemName));


        } while (true);

        //print the items one-by-one
        for (int i =0; i <itemName.length; i++) {
            //check availability of an item and print
            //sold out or available

            String check = null;
            if (itemAvailable[i] == true){
                check = "Available";
            }else {
                check = "sold out";

            }
            System.out.println(itemName[i]+" "+itemPrices[i]+" "+itemAvailable[i]);
        }

        //Linear search by item name
        for (int i = 0; i < itemName.length; i++){
            System.out.print("Enter the item name:__");
            String searchTerm = in.next();

            if (itemName[i].equalsIgnoreCase(searchTerm)){
                System.out.println(itemName[i]+ "\t" +itemPrices[i]+ "\t" +itemAvailable[i]);

            } else {
                System.out.println(searchTerm+ "not found.");
            }
        }

        /*
        bread 12
        berries 300
        pringles 350
        apple 30
         */

        }
}
