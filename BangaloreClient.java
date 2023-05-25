import java.rmi.*;
import java.util.ArrayList;
import java.util.Scanner;

public class PulipakaP2Client{

public static void main(String args[]){
try{

PulipakaP2Interface stub=(PulipakaP2Interface)Naming.lookup("rmi://localhost:5000/stub");
ArrayList<String> names = new ArrayList<String>();
ArrayList<Double> prices = new ArrayList<Double>();

Scanner scn = new Scanner(System.in);
while (true)
{
	System.out.println("Provide Product name(exit to quit) : ");
	String name = scn.nextLine();
	if (name.toLowerCase().equals("exit"))
	{
		break;
	}
	System.out.println("Enter bid price for the item: ");
	double price = scn.nextDouble();
	
	if (!names.contains(name))
	{
		names.add(name);
		prices.add(price);
	}
	else
	{
		prices.set(names.indexOf(name), price);
	}
	stub.placeBid(price, name);
	
	for(int i=0;i<names.size();i++)
	{
		System.out.println(names.get(i));
		System.out.println(stub.getNotified(names.get(i), prices.get(i)));
	}
	scn.nextLine();
}
}catch(Exception e){System.out.println(e);}
}

}
