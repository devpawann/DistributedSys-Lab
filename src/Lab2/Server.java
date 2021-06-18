package Lab2;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Server {
    public static void main(String[]args) throws RemoteException {
        Registry reg = LocateRegistry.createRegistry(5099);
        HelloServent helloservent = new HelloServent();
        reg.rebind("hello",(Remote) helloservent);
        System.out.println("Server Running");
    }
}