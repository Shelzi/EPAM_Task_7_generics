package by.epam.lab;

public class Purchase {
    private final Priceable product;
    private final double quantity;

    public Purchase() {
        product = new Product();
        quantity = 0.0;
    }

    public Purchase(Priceable product, double quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public Priceable getProduct() {
        return product;
    }

    public double getQuantity() {
        return quantity;
    }

    public Byn getCost() {
        return product.getPrice().mul(quantity, RoundMethod.FLOOR, 2);
    }

    @Override
    public String toString() {
        return String.format("%s;%s", product, quantity);
    }
}