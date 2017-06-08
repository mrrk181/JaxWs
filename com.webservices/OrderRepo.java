import java.util.*;
public class OrderRepo{

    private static OrderRepo repo;
    private List<Order> orders;
    private List<Product> prods;

    private List<Customer> customers;
    private OrderRepo(){
        orders = new ArrayList<Order>();
        prods= new ArrayList<Product>();
        customers= new ArrayList<Customer>();

    }
    public static OrderRepo Instantiate(){
        if(repo==null){
            repo = new OrderRepo();
        }
        return repo;
    }
    public List<Order> getAllOrders(){
        return orders;
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
        prods.add(product);
    }
    public List<Product> getAllProducts(){
        List<Product> ps = new ArrayList<Product>();
            for (Order o : orders){
                for (Product p : o.getProducts()){
                    ps.add(p);
                }
            }
            for (Product _p : prods){
                ps.add(_p);
            }
            return ps;
    }
    public void addCustomer(Customer customer){
        customers.add(customer);
    }
    public List<Customer> getAllCustm(){
        List<Customer> c = new ArrayList<Customer>();
        for (Order o : orders){
            c.add(o.getCustomer());
        }
        for (Customer _c : customers){
            c.add(_c);
        }

        return c;
    }
}
