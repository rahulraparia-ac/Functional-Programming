package functionalInterface;

import java.util.function.Consumer;

public class _Consumer {
    public static void main(String[] args) {
        Customer maria = new Customer
                ("Maria", "999999");
        //Traditional Way
        greetCustomer(maria);
        //Using Consumers
        greetCustomerConsumer.accept(maria);
    }

    static Consumer<Customer> greetCustomerConsumer = customer -> System.out.println("Hello " + customer.customerName
            + ", thanks for registering your phone number "
            + customer.customerPhNo);

    static void greetCustomer(Customer customer) {
        System.out.println("Hello " + customer.customerName
                + ", thanks for registering your phone number "
                + customer.customerPhNo);
    }

    static class Customer {
        private final String customerName;
        private final String customerPhNo;

        Customer(String customerName, String customerPhNo) {
            this.customerName = customerName;
            this.customerPhNo = customerPhNo;
        }
    }
}
