public class MenuItem {

    private String code;
    private String name;
    private double price;
    private String category;
    private static int productCount = 0;

        public MenuItem (String code, String name, double price, String category){
            this.code = code;
            this.name = name;
            this.price = price;
            this.category = category;
            productCount++;
}
    //a static method returning the number of created products,


    public static int getProductCount() {
        return productCount;
    }

    @Override
    public String toString() {
//an overridden toString(),

    }

    @Override
    public String equals(){
           // /an overridden equals() comparing products by code.
    }

}
