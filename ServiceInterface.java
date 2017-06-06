import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
import java.util.*;
public interface ServiceInterface{
    @WebMethod
    public List<Order> getAllOrders();

    @WebMethod
    public void addOrder(Order order);

    @WebMethod
    public void removeOrder(Order order);

    @WebMethod
    public void addProduct(Product product);

    @WebMethod
    public List<Product> getAllProducts();

    @WebMethod
    public void addCustomer(Customer customer);

    @WebMethod
    public List<Customer> getAllCustm();
}
