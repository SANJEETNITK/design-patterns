package solid_design_pattern.single_responsibility;

public class SingleResponsibilityExample {
    public static void main(String[] args) {

        ShoppingCart cart = new ShoppingCart();
        Product soap = new Product("Lux", 16.0);
        cart.addProduct(soap);

        ProductCatalog productCatalog = new ProductCatalog();
        productCatalog.displayProductDetails(soap);

        OrderProcessor orderProcessor = new OrderProcessor();
        orderProcessor.processOrder(cart);
    }
}

