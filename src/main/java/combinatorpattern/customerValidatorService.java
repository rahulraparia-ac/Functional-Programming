package combinatorpattern;

import java.time.LocalDate;
import java.time.Period;

public class customerValidatorService {
    private boolean isEmailValid(String email) {
        return email.contains("@acuverconsulting.com");
    }

    private boolean isPhoneNumberValid(String phoneNumber) {
        return phoneNumber.startsWith("+91");
    }

    private boolean isAdult(LocalDate dob) {
        return Period.between(dob, LocalDate.now()).getYears() > 18;
    }

    public boolean isValid(Customer customer) {
        return isEmailValid(customer.getEmail()) &&
                isPhoneNumberValid(customer.getPhoneNumber()) &&
                isAdult(customer.getDob());
    }

}
