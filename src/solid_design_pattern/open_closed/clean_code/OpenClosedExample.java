package solid_design_pattern.open_closed.clean_code;

public class OpenClosedExample {
    public static void main(String[] args) {
        Operation addOperation = new AddOperation();
        System.out.println(addOperation.perform(4.0, 5.2));

        Operation subtractOperation = new SubtractOperation();
        System.out.println(subtractOperation.perform(7.6, 5.2));
    }
}
