public class CafeCustomer {

    private int customerId;
    private String firstName;
    private String lastName;
    private String email;

    public CafeCustomer(int customerId, String firstName, String lastName, String email) {
        this.customerId = customerId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }
//a method returning full customer data
    public static getCustomerData(){
        System.out.println(customerId);
        System.out.println(firstName);
        System.out.println(lastName);
        System.out.println(email);
    }

    @Override
    public String toString() {

    }

    @Override
    public String equals(){

    }

}
