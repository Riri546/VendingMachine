import java.util.ArrayList;
import java.util.List;

public class VendingMachine {
    private List<Product> products;

    public VendingMachine(List<Product> products){
        super();
        this.products = products;
    }
    
    public VendingMachine(){
        this(new ArrayList<>());
    }

    public List<Product> geProductsByCost(double cost){
        List<Product> res = new ArrayList<>();
        for (Product product: products){
            if(product.getCost() <= cost){
                res.add(product);
            }
        }
        return res;
    }
    public void add(String name, double cost){
        Product product = new Product(name, cost);
        products.add(product);
    }
}