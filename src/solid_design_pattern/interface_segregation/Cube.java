package solid_design_pattern.interface_segregation;

class Cube implements Shape, ThreeDimensionalShape {

    double side;

    Cube(double side) {
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return 6 * side * side;
    }

    @Override
    public double calculateVolume() {
        return side * side * side;
    }
}
