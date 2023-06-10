package creational_design_patterns.builder;

public class BuilderPatternExample {
    public static void main(String[] args) {
        Person person = new Person.Builder("Sanjeet")
                .age(24)
                .address("Bangalore")
                .phoneNumber("9999999999")
                .build();
    }
}
