public class MainTester{
    public static void main (String a[]){
        OrderRepo _repo = OrderRepo.Instantiate();
        new OrderSeeder();
        for (Order o : _repo.getAllOrders()){
            System.out.println(o.getCustomer().getName());
            System.out.println(o.getId());
            System.out.println();



        }
    }
}
