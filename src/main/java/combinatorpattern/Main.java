package combinatorpattern;

import java.time.LocalDate;

import static combinatorpattern.CustomerRegistrationValidator.*;
import static combinatorpattern.CustomerRegistrationValidator.ValidationResult.*;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer(
                "Rahul",
                "rahul.raparia@acuverconsulting.com",
                "+917291962387",
                LocalDate.of(2019, 4, 6)
        );

//        System.out.println(new customerValidatorService().isValid(customer));

        // Using Combinator Pattern
        ValidationResult result = isEmailValid()
                .and(isAdult())
                .and(isPhoneNumberValid())
                .apply(customer);

        System.out.println(result);

        if (result != SUCCESS){
            throw new IllegalStateException(result.name());
        }
    }
}
