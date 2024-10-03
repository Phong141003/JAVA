import java.util.HashMap;
import java.util.Scanner;
class Product {
    String name;
    double price;
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
}
public class bai2_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        bai2_2 converter = new bai2_2();
        Product[] products = {
                new Product("Laptop", 1000),
                new Product("Smartphone", 700),
                new Product("Headphones", 150)
        };
        System.out.println("Products available:");
        for (int i = 0; i < products.length; i++) {
            System.out.println((i + 1) + ". " + products[i].name + " - $" + products[i].price);
        }
        System.out.print("Select a product by number: ");
        int productChoice = scanner.nextInt() - 1;
        Product selectedProduct = products[productChoice];
        System.out.print("Enter currency for payment (USD, EUR, GBP, JPY): ");
        String currency = scanner.next().toUpperCase();
        double convertedPrice = converter.convert(selectedProduct.price, "USD", currency);
        System.out.printf("The price of %s in %s is %.2f %s\n", selectedProduct.name, currency, convertedPrice, currency);
        scanner.close();
    }
}
