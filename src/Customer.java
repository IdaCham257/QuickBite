public class Customer {
    String name;

    public Customer(String name) {
        this.name = name;
    }

    public String getName(){
        return this.name;
    }
    public  int getpriority(){
        return 0;
    }
    public String describe(){
        return this.name + "(priority " +getpriority()+ ")";
    }

}
