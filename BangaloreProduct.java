import java.rmi.*;
import java.util.ArrayList;

public class BangaloreProduct {
	String name;
	String description;
	double price;
	int time;
	ArrayList<Double> bids = new ArrayList<Double>();

	BangaloreProduct() throws RemoteException {
		super();
	}

	public BangaloreProduct(String name, String description)  {
		super();
		this.name = name;
		this.description = description;
		price = 0;
		time = 1;
	}
	
	public BangaloreProduct(String name, String description, double price)  {
		super();
		this.name = name;
		this.description = description;
		this.price = price;
		this.time = 1;
	}
	
	public BangaloreProduct(String name, String description, int time)  {
		super();
		this.name = name;
		this.description = description;
		this.price = 0;
		this.time = time;
	}
	
	public BangaloreProduct(String name, String description, double price, int time)  {
		super();
		this.name = name;
		this.description = description;
		this.price = price;
		this.time = time;
	}

	
	
}
