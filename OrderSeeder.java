public class OrderSeeder{
    public OrderSeeder(){
        OrderRepo _repo = OrderRepo.Instantiate();
    }
    Customer c0= new Customer(1, "Khan");
    Customer c1= new Customer(2, "Khan1");
    Customer c2= new Customer(3, "Khan2");
    Customer c3= new Customer(4, "Khan3");
    Customer c4= new Customer(5, "Khan4");

    Product p0 = new Product(1,"Shampoo", 35.5);
    Product p1 = new Product(2,"soap", 40.5);
    Product p2 = new Product(3,"toothpaste", 50.5);
    Product p3 = new Product(4,"Hair spray", 60.5);
    Product p4 = new Product(5,"Perfume", 100.5);

    Order o0= new Order(1);
    Order o1= new Order(2);
    Order o2= new Order(3);
    Order o3= new Order(4);
    Order o4= new Order(5);
}
