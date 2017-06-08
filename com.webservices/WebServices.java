import javax.jws.WebService;
import java.util.*;

@WebService(endpointInterface = "WebServices")
public class WebServices implements ServiceInterface{
    @Override
    public List<Order> getAllOrders(){
        return OrderRepo.Instantiate().getAllOrders();
    }
    @Override
    public void addOrder(Order order){
        OrderRepo.Instantiate().addOrder(order);
    }
    @Override
    public void removeOrder(Order order){
        OrderRepo.Instantiate().removeOrder(order);
    }
    @Override
    public void addProduct(Product product){
        OrderRepo.Instantiate().addProduct(product);
    }
    @Override
    public List<Product> getAllProducts(){
        return OrderRepo.Instantiate().getAllProducts();
    }
    @Override
    public void addCustomer(Customer customer){
        OrderRepo.Instantiate().addCustomer(customer);
    }

    @Override
    public List<Customer> getAllCustm(){
        return OrderRepo.Instantiate().getAllCustm();
    }
    @Override
    public Order getOrderById(int id){
        return OrderRepo.Instantiate().getOrderById(id);
    }
}
