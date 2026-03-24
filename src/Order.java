public class Order {

    private int orderNumber;
    private CafeCustomer customer;
    private ArrayList<MenuItem> items;
    private boolean paid;
    private static int nextOrderNumber = 1;

    public Order(int orderNumber, CafeCustomer customer, <MenuItem> items, boolean paid, int nextOrderNumber) {
        this.orderNumber = orderNumber;
        this.customer = customer;
        this.items = new ArrayList<>();
        this.paid = false;
    }


    //calculateTotal()
    public double calculateTotal() {
        double sum = 0;
        for (MenuItem item : items) {
            sum += item.getPrice();
        }
        return sum;
    }

    //countItems()
    public void countItems() {
        return items.size();
    }

    //addItem(MenuItem item)
    public void addItem(MenuItem m1) {
        items.add(item);
    }

    //markAsPaid()
    public void markAsPaid() {
        this.paid = true;
    }


    //public static int getNextOrderNumber() or another static method related to order numbering,
    public static int getNextOrderNumber(){
        return nextOrderNumber;
    }

    //an overridden toString().
    @Override
    public String toString(){
        return "Order{" +
                "orderNumber=" + orderNumber +
                ", customer=" + customer +
                ", items=" + items +
                ", total=" + calculateTotal() +
                ", paid=" + paid +
                '}';

    }

}
