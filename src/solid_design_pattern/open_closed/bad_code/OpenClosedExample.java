package solid_design_pattern.open_closed.bad_code;

public class OpenClosedExample {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        double sum = calculator.perform(2.6, 7.9, "sum");
        double diff = calculator.perform(5.9, 2.3, "sub");
    }
}
