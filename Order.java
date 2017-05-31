public class Order{
    private int id;
    private double total;
    private Customer customer;
    private List<Product> products;

    public void purchaseProduct(product){
        products.add(product);
    }
    public void removeProduct(product){
        //todo Remove from List
    }
    public List<Product> getProducts(){
        return products;
    }
}
