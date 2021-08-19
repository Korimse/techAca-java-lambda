package first.project.api.customer;

public class Customer {

    private String id;
    private String firstName;
    private String lastName;

    public Customer(){} //NoArgumentsConstructor
    public Customer(String id, String firstName, String lastName){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id='" + id + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
