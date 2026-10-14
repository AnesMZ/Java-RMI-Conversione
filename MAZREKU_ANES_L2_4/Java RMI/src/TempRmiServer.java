import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class TempRmiServer extends UnicastRemoteObject implements ITempConv {

    protected TempRmiServer() throws RemoteException {
        super();
    }

    @Override
    // SKELETON
    public double cels2Fahr(final double CELS) throws RemoteException {
        return CELS*9/5+32;
    }

     @Override
    // SKELETON
    public double fahr2Cels(final double FAHR) throws RemoteException {
        return (FAHR-32)*5/9;
    }
}