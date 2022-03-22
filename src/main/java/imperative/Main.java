package imperative;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static imperative.Main.Gender.FEMALE;

public class Main {
    public static void main(String[] args) {
        List<Person> people = List.of(
            new Person("Jenny", FEMALE),
            new Person("Arjun", Gender.MALE),
            new Person("Lilly", FEMALE),
            new Person("Max", Gender.MALE),
            new Person("Billy", FEMALE)
        );
        // How to print information about people with FEMALE gender ?
        //Imperative approach
        System.out.println("Imperative approach");
        List<Person> females = new ArrayList<>();   //Making an Emplty List called females

        for (Person person : people){               //Looping through people for each person
            if (FEMALE.equals(person.gender)) {     //Check If FEMALE = gender of the person obj
                females.add(person);                //If yes Add her record to the females empty list defined above
            }
        }

        for (Person female : females){              //Looping through females for each person
            System.out.println(female);
        }
        

        //Declarative Approach
        System.out.println("Declarative Approach");
        people.stream()                                                 // Making a Stream of the List "person"
                .filter(person -> FEMALE.equals(person.gender))         // Filtering the stream and keeping only records with GENDER = FEMALE
                .collect(Collectors.toList())                           //Collecting the result into a list
                .forEach(System.out::println);                          //Printing all the records in the list
    }



    static class Person {
        private final String name;
        private final Gender gender;

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    '}';
        }
        Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }
    }
    enum Gender {
        MALE, FEMALE
    }


}
