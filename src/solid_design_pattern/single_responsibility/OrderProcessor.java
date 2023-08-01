package solid_design_pattern.single_responsibility;

class OrderProcessor {
    public void processOrder(ShoppingCart cart) {
        // Code to process the order
        double totalPrice = cart.calculateTotalPrice();
        System.out.println("Order processed. Total price: $" + totalPrice);
    }
}
