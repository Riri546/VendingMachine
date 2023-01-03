import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine();
        List<Product> products = new ArrayList<>();
        VendingMachine vendingMachine2 = new VendingMachine(products);

        Product product = new Product("Coca-cola", 110);
        
    }
}
