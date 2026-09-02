public class Main {
    public static void main(String[] args){
        //QuickBite
        /*
        itemName: data type for this Array is Sring
        itemPrices: data type for this Array is double
        itemAvailable: data type for this Array is boolean
         */

        String[] itemName = {"bread", "berries", "pringles", "apple"};
        double[] itemPrices = {12, 200, 350, 30};
        boolean[] itemAvailable = {true, false, true, false};

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

        /*
        bread 12
        berries 300
        pringles 350
        apple 30
         */

        }
}
