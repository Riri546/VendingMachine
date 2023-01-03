
import java.util.ArrayList;
import java.util.List;

public class VendingMachine {
    List<Product> products;


    public VendingMachine(List<Product> products){
        this.products = products;
    }
    
    public VendingMachine(){
        this(new ArrayList<>());
    }
}