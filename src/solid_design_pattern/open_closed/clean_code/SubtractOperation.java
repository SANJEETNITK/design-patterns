package solid_design_pattern.open_closed.clean_code;

public class SubtractOperation implements Operation {

    @Override
    public Double perform(Double a, Double b) {
        return a - b;
    }
}
