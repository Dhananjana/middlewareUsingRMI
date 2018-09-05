import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;

public class Client {
    private Client() {}
    public static void main(String[] args) {
        try {
            System.out.println("Operations provide by the system:");
            System.out.println("1: Maximum => Max");
            System.out.println("2: Minimum => Min");
            System.out.println("3: Addition => Add");
            Scanner sc = new Scanner(System.in);
            String c = "y";
            boolean val = true;
            while(val){
                System.out.println("Select the operation:");
                String opr = sc.next();

                System.out.println("Enter the number 1:");
                int num1 = sc.nextInt();

                System.out.println("Enter the number 2:");
                int num2 = sc.nextInt();

                System.out.println("Enter the number 3");
                int num3 = sc.nextInt();

                // Getting the registry
                Registry registry = LocateRegistry.getRegistry(null);

                // Looking up the registry for the remote object
                Hello stub = (Hello) registry.lookup("Hello");

                // Calling the remote method using the obtained object
                int i = stub.printMsg();
                //System.out.print(i) ;
                // System.out.println("Remote method invoked");
                if(opr.equals("Max")){
                    int n1 = stub.selectMax(num1, num2, num3);
                    System.out.println("Maximum value is "+n1);
                }
                if (opr.equals("Min")){
                    int n2 = stub.selectMin(num1, num2, num3);
                    System.out.println("Minimum value is "+n2);
                }
                if(opr.equals("Add")){
                    int n3 = stub.add(num1, num2, num3);
                    System.out.println("Total value is "+n3);
                }
                System.out.println("*****************************");
                System.out.print("Do you want to Continue the operation:(Y/N)");
                c = sc.next();
                //System.out.print(c);
                if(c.equals("N")){
                    val = false;
                }
            }
            System.out.print("Exited the program");
        } catch (Exception e) {
            System.err.println("Client exception: " + e.toString());
            e.printStackTrace();
        }
    }
}