package creational_design_patterns.builder;

public class BuilderPatternExample {
    public static void main(String[] args) {
        // name is mandatory for creating person object
        Person person = Person.builder("Sanjeet")
                .age(24)
                .address("Bangalore")
                .phoneNumber("9999999999")
                .build();
        System.out.println("person = " + person);
    }
}
