import java.rmi.Remote;
import java.rmi.RemoteException;

//interface used by client and server
public interface PulipakaP2Interface extends Remote {
	public void placeBid(double price, String name) throws RemoteException;
	public String getNotified(String name, double price) throws RemoteException;
	
}