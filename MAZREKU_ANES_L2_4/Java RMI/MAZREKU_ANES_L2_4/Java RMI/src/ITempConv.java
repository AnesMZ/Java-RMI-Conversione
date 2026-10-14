import java.rmi.Remote;
import java.rmi.RemoteException;

// STUB
public interface ITempConv extends Remote {
    double cels2Fahr(final double CELS) throws RemoteException;
    double fahr2Cels(final double FAHR) throws RemoteException;
    double cels2Kelv(final double CELS) throws RemoteException;
    double kelv2Cels(final double KELV) throws RemoteException;
}