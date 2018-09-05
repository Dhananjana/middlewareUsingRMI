import java.rmi.Remote;
import java.rmi.RemoteException;

// Creating Remote interface for our application 
public interface Hello extends Remote {
    int printMsg() throws RemoteException;
    int selectMax(int n1, int n2, int n3) throws RemoteException;
    int selectMin(int n1, int n2, int n3) throws RemoteException;
    int add(int n1, int n2, int n3) throws RemoteException;
} 