package course.lambdas3.entities;

public class Product {
    private String name;
    private Double price;

    public Product(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public static void staticPriceUpdate(Product product) {
        product.setPrice(product.getPrice() * 1.1);
    }

    public void nonStaticPriceUpdate() {
        price = price * 1.1;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return this.name + ", " + String.format("%.2f", this.price);
    }
}
