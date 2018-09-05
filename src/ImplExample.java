import java.rmi.RemoteException;

// Implementing the remote interface
public class ImplExample implements Hello {

    // Implementing the interface method
    public int printMsg() {
        return 8;
    }

    @Override
    public int selectMax(int n1, int n2, int n3) {
        System.out.println("Server is running Maximum Function");
        int out = n1;
        if (n1>n2){
            if (n1>n3){
                out = n1;
            }else{
                out = n3;
            }
        }else{
            if (n2>n3){
                out = n2;
            }else{
                out = n3;
            }
        }
        return out;

    }

    @Override
    public int selectMin(int n1, int n2, int n3) {
        System.out.println("Server is running Minimum Function");
        int out = n1;
        if (n1<n2){
            if (n1<n3){
                out = n1;
            }else{
                out = n3;
            }
        }else{
            if (n2<n3){
                out = n2;
            }else{
                out = n3;
            }
        }
        return out;
    }

    @Override
    public int add(int n1, int n2, int n3) {
        System.out.println("Server is running the Addition function");
        int out = n1 + n2 + n3;
        return out;
    }
}