import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class TempSrv {
    public static void main(String[] args) {
        // Registrazione del servizio
        try {
            // Instanzio oggetto remoto (servizio)
            final TempRmiServer SERVER_RMI = new TempRmiServer();
            // Crea un registro
            // Registry
            LocateRegistry.createRegistry(1099);
            // Rregistra il serivizio con un nome
            Naming.rebind("MaxTempConvService", SERVER_RMI);
        
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.exit(1);
        } 
    }
}
