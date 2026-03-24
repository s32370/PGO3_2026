public class Order {

    private int orderNumber;
    private CafeCustomer customer;
    private ArrayList<MenuItem> items;
    private boolean paid;
    private static int nextOrderNumber;

    public Order(int orderNumber, CafeCustomer customer, <MenuItem> items, boolean paid, int nextOrderNumber) {
        this.orderNumber = orderNumber;
        this.customer = customer;
        this.items = items;
        this. = ;
    }


    //calculateTotal()
    public String calculateTotal() {
    }

    //countItems()
    public String countItems() {
    }

    //addItem(MenuItem item)
    public void addItem(MenuItem m1) {
    }

    //markAsPaid()
    public void markAsPaid() {
    }


    //public static int getNextOrderNumber() or another static method related to order numbering,
    public static int getNextOrderNumber(){

    }

    //an overridden toString().
    @Override
    public String toString(){

    }

}
