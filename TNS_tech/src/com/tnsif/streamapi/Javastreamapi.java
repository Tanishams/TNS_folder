package com.tnsif.streamapi;
//parallel stream
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Product{
	public Product(int id, String name, float price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	int id;
	String  name;
	float price;
}


public class Javastreamapi {
public static void main(String[] args) {
	List<Product> pl=new ArrayList<Product>();
	pl.add(new Product(1,"HP",60000));
	pl.add(new Product(2,"Dell",70000));
	pl.add(new Product(3,"Apple",100000));
	pl.add(new Product(4,"Lenovo",20000));
	
	List<Float> pl2= pl.stream().filter(p->p.price>30000) //using filter()
	.map(p->p.price)
	.collect(Collectors.toList());
	System.out.println(pl2);
	
	//to sum up the price
	double totalprice=pl.stream().collect(Collectors.summingDouble(Product->Product.price));
	System.out.println("Total price of the laptop is:"+totalprice);
	
	//max and min product price
	Product p3 = pl.stream()
            .max((o1, o2) -> Double.compare(o1.price, o2.price))
            .get();	
	System.out.println(p3.price);
	
	//count
	long count = pl.stream()
            .filter(p -> p.price < 9000)
            .count();

System.out.println(count);
}
}
