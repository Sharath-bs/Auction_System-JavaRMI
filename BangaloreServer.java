import java.net.MalformedURLException;
import java.rmi.*;
import java.rmi.registry.*;
import java.util.Scanner;

public class BangaloreServer{

public static void main(String args[]) throws RemoteException, MalformedURLException, AlreadyBoundException{
try{

//Bidding stub=new RemoteBidding();
BangaloreService rm = new BangaloreService();
BangaloreInterface stub = rm;

//System.out.println(stub);
Naming.rebind("rmi://localhost:5000/stub",stub);
Scanner scn = new Scanner(System.in);
while (true)
{
	System.out.println("Enter the product name : ");
	String name = scn.nextLine();
	System.out.println("Enter the product description : ");
	String desc = scn.nextLine();
	System.out.println("Enter the product price [Enter 0 for default value] : ");
	double price = scn.nextDouble();
	System.out.println("Enter the product time [Enter 1 for default value] : ");
	int time = scn.nextInt();
	rm.addProduct(name, desc, price, time);
	scn.nextLine();
}

}catch(Exception e){System.out.println(e);}
}

}
