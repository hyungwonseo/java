package Java0329;

public class Main {
    public static void main(String[] args) {
        Product product = new Product("Laptop", 999.99
                , Category.ELECTRONICS);
        System.out.println(product.getCategory());
    }
}
