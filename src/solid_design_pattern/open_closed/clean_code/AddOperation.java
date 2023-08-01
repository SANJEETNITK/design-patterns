package solid_design_pattern.open_closed.clean_code;

public class AddOperation implements Operation {
    @Override
    public Double perform(Double a, Double b) {
        return a + b;
    }
}
