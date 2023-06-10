package creational_design_patterns.builder;

public class Person {
    private String name;
    private int age;
    private String address;
    private String phoneNumber;

    private Person(Builder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.address = builder.address;
        this.phoneNumber = builder.phoneNumber;
    }

    // Getters...

    public static class Builder {
        private String name;
        private int age;
        private String address;
        private String phoneNumber;

        // name is mandatory
        public Builder(String name) {
            this.name = name;
        }

        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public Builder address(String address) {
            this.address = address;
            return this;
        }

        public Builder phoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public Person build() {
            return new Person(this);
        }
    }
}