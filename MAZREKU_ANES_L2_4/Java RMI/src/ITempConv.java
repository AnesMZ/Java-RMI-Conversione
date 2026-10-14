import java.rmi.Remote;
import java.rmi.RemoteException;

// STUB
public interface ITempConv extends Remote {
    double cels2Fahr(final double CELS) throws RemoteException;
    double fahr2Cels(final double FAHR) throws RemoteException;
}