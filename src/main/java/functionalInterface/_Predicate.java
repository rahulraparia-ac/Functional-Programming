package functionalInterface;

import java.util.function.Predicate;

public class _Predicate {
    public static void main(String[] args) {
        System.out.println("W/O Predicate");
        System.out.println(isPhoneNumberValid("+917291962387"));
        System.out.println(isPhoneNumberValid("1231231231231"));

        System.out.println("W/ Predicate");
        System.out.println(isPhoneNumberValidPredicate.test("+917291962387"));
        System.out.println(isPhoneNumberValidPredicate.test("1231231231231"));

        System.out.println("Joined Predicates");
        System.out.println(isPhoneNumberValidPredicate.and(containsNumber3).test("+917291962387"));

    }

    static boolean isPhoneNumberValid(String phoneNumber) {
        return phoneNumber.startsWith("+91")&& phoneNumber.length() == 13;
    }

    static Predicate<String> isPhoneNumberValidPredicate = phoneNumber
            -> phoneNumber.startsWith("+91")&& phoneNumber.length() == 13;

    static Predicate<String> containsNumber3 = phoneNumber
            -> phoneNumber.contains("3");
    


}
