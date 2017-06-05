import java.util.*;
public class OrderRepo{

    private static OrderRepo repo;
    private List<Order> orders;
    private List<Product> prods;

    private List<Customer> customers;
    private OrderRepo(){

    }
    public static OrderRepo Instantiate(){
        if(repo==null){
            repo = new OrderRepo();
        }
        return repo;
    }
    public void addOrder(Order order){
        orders.add(order);
    }
    public void removeOrder(Order order){
        orders.remove(order);
    }
    public Order getOrderById(int id){
        for (Order o : orders){
            if(o.getId()==id){
                return o;
            }
        }
        return null;
    }
    public void addProduct(Product product){
        prods.add(products);
    }
    public List<Product> getAllProds(){
        List<Product> prods;
            for (Order o : orders){
                for (Product p : o.getProducts()){
                    prods.add(p);
                }
            }
    }
    public void addCustomer(Customer customer){
        customers.add(customer);
    }
    public List<Customer> getAllCustm(){
        return customers;
    }
}
