package Lab2;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class HelloServent extends UnicastRemoteObject implements HelloService{

    public HelloServent() throws RemoteException {
        super();
    }

    @Override
    public String echo(String input) throws RemoteException {
        // TODO Auto-generated method stub
        return "Hello Client " + input;
    }

    @Override
    public int add(int input) throws RemoteException {
        // TODO Auto-generated method stub
        return 2+input;
    }


}