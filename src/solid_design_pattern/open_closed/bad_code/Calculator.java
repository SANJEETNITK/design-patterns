package solid_design_pattern.open_closed.bad_code;

public class Calculator {

    /*
    This is a bad code example because every time we want to add a new operation type, we need to add a
    new if statement and based on that we need to perform the operation.
    According to open-closed principle, a class should be open for extension and closed for modification
    Lets solve this issue, see the clean code example
     */
    public double perform(double a, double b, String operationType) {
        if (operationType.equals("sum")) {
            return a + b;
        }
        if (operationType.equals("sub")) {
            return a - b;
        }
        throw new UnsupportedOperationException("Invalid Operation Type");
    }

}
