public class Product implements Taxable {
    private int productId;
    private String name;
    private double price;
    private int quantity;

    public Product(int productId, String name, double price, int quantity) {
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    @Override
    public double calculateTax() {
        return price * salesTax * quantity;
    }

    @Override
    public String toString() {
        return "Product [productId=" + productId + ", name=" + name + ", price=" + price + ", quantity=" + quantity + "]";
    }

    public int getQuantity() {
        return quantity;
    }
}
