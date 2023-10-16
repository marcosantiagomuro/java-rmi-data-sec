import java.rmi.*;

public interface Adder {
    public int add(int x, int y) throws RemoteException;
}
