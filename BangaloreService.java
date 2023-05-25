import java.rmi.*;
import java.rmi.server.*;
import java.util.ArrayList;

public class BangaloreService extends UnicastRemoteObject implements BangaloreInterface {

	ArrayList<BangaloreProduct> products = new ArrayList<BangaloreProduct>();

	BangaloreService() throws RemoteException {
		super();
	}

	public void addProduct(String name, String description) {
		products.add(new BangaloreProduct(name, description));
	}

	public void addProduct(String name, String description, double price) {
		products.add(new BangaloreProduct(name, description, price));
	}

	public void addProduct(String name, String description, int time) {
		products.add(new BangaloreProduct(name, description, time));
	}

	public void addProduct(String name, String description, double price, int time) {
		products.add(new BangaloreProduct(name, description, price, time));
	}

	public void placeBid(double price, String name) {

		for (int i = 0; i < products.size(); i++) {
			double max = 0;
			for (int j = 0; j < products.get(i).bids.size(); j++) {
				if (products.get(i).bids.get(j) > max)
					max = products.get(i).bids.get(j);
			}
			if (products.get(i).name.equals(name)) {
				products.get(i).bids.add(price);
			}

		}

	}

	public String getNotified(String name, double price) throws RemoteException {
		for (int i = 0; i < products.size(); i++) {
			if (products.get(i).name.equals(name)) {
				double max = 0;
				for (int j = 0; j < products.get(i).bids.size(); j++) {
					if (products.get(i).bids.get(j) > max)
						max = products.get(i).bids.get(j);
				}
				if (max > price) {
					return "Notification : Maximum bid for product " + name + " placed at " + max;
				}
			}

		}
		return "";
	}

}
