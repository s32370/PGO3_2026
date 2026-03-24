public class CafeCustomer {

    private static int customerId;
    private static String firstName;
    private static String lastName;
    private static String email;

    public CafeCustomer(int customerId, String firstName, String lastName, String email) {
        this.customerId = customerId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }
//a method returning full customer data
    public static getCustomerData(){
        return customerId + " - " + firstName + " " + lastName + " (" + email + ")";
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + customerId +
                ", name='" + firstName + " " + lastName + '\'' +
                ", email='" + email + '\'' +
                '}';

    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof CafeCustomer)) return false;

        CafeCustomer other = (CafeCustomer) obj;
        return this.customerId == other.customerId ||
                this.email.equals(other.email);

}
