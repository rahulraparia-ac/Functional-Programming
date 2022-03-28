 package streams;

import java.util.List;
import java.util.function.Function;
import java.util.function.IntConsumer;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;

import static streams._Stream.Gender.*;

 public class _Stream {
    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("Jenny", FEMALE),
                new Person("Arjun", MALE),
                new Person("Lilly", FEMALE),
                new Person("Max", MALE),
                new Person("Billy", FEMALE),
                new Person("Archit", MALE)
        );

        // Printing all the genders in list Person
        System.out.println("All the genders in list Person");
        people.stream()
                .map(person -> person.gender)
                .collect(Collectors.toSet())
                .forEach(System.out::println);

        //Printing all the names in list Person
        Function<Person, String> personStringFunction = person -> person.name;
        ToIntFunction<String> length = String::length;
        IntConsumer println = System.out::println;
        System.out.println("\nAll the names in list Person");
        people.stream()
                .map( personStringFunction)
                .mapToInt(length)
                .forEach(println);


        //If everyone in People Female?
        System.out.println("\nIs everyone Female? ");
        System.out.println(
                (people.stream()
                .allMatch(person -> FEMALE.equals(person.gender))));

        //If anyone in People Female?
        System.out.println("\nIs anyone Female? ");
        System.out.println(
                (people.stream()
                        .anyMatch(person -> FEMALE.equals(person.gender))));
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
