package solid_design_pattern.single_responsibility;

class ProductCatalog {
    public void displayProductDetails(Product product) {
        // Code to display product details
        System.out.println("Product: " + product.getName());
        System.out.println("Price: $" + product.getPrice());
    }
}
