import java.util.*;
public class Order{
    private int id;
    private double total;
    private Customer customer;
    private List<Product> products;
    public Order(int id){
        this.id=id;
    }
    public void purchaseProduct(Product product){
        products.add(product);
    }
    public void removeProduct(Product product){
        products.remove(product);
    }
    public List<Product> getProducts(){
        return products;
    }
    public void addCustomer(Customer customer){
        this.customer= customer;
    }
    public Customer getCustomer(){
        return customer;
    }
    public int getId(){
        return id;
    }
}
