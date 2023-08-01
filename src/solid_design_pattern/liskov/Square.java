package solid_design_pattern.liskov;

class Square extends Shape {
    private double side;

    public Square(double side) {
        this.side = side;
        this.area = side * side;
    }

    public double getSide() {
        return side;
    }
}
