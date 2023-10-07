package solid_design_pattern.interface_segregation;

public class InterfaceSegregationExample {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(5.0, 4.0);
        System.out.println("Area of rectangle = " + rectangle.calculateArea());

        Cube cube = new Cube(7.0);
        System.out.println("Area of cube = " + cube.calculateArea());
        System.out.println("Volume of cube = " + cube.calculateVolume());
    }
}


