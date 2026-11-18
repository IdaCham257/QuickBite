import java.util.ArrayList;
import java.util.List;

public class FoodTruck {
    // Data Structure to hold our MenuItem
    private List<MenuItem> menu = new ArrayList<>();

    // method
    public void addItem(MenuItem item) {
        menu.add(item);
    }

    public void printMenu(){
        for(MenuItem item : menu){
            System.out.println(item);
        }
    }

    //Filter item by name
    public MenuItem findItemByName(String name) {
        for (MenuItem item : menu) {
            // check for the item name
            if(item.getName().equalsIgnoreCase(name)) {
                return item;
            }
        }

        return null;


        // place-order
        public void PlaceOrder(String code) {
            MenuItem item = findItemByCode(code);
            if (item == null) {
                System.out.println("Item not on the menu");
            } else if (item.canOrder()) {
                System.out.println("order placed " +item.getName());
            } else {
                System.out.println("sorry, " +item.getName() + "is sold out");
            }
        }
    }
}
