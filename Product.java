public class Product.java{
	private int id;
	private String name;
	private double price;

	public Product(int id, String name, double price){
		this.price=price;
		this.name=name;
		this.id=id;
	}
	public int getId(){
		return id;
	}
	public String getName(){
		return name;
	}
	public double getPrice(){
		return price;
	}

}
