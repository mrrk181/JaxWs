import javax.jws.WebService;

public class WebServices implements ServiceInterface{
    @Override
    public List<Order> getAllOrders(){
        return OrderRepo.Instantiate().getAllOrders();
    }

}
