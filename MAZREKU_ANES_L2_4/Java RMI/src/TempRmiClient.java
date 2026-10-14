import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.rmi.Naming;

public class TempRmiClient {

    public static void main(String[] agrs) {

        final BufferedReader IN = new BufferedReader(new InputStreamReader (System.in));

        try {
            // Connessione al serivizio (oggetto) RMI remoto
            // Registry
            final ITempConv TEMPERATURE_CONVERTION_SERVICE = (ITempConv) 
                Naming.lookup("rmi://localhost:1099/MaxTempConvService");

            // Interazione con l'utente UI
            System.out.println("Temperatura in °C: ?");
            final String MESSAGE = IN.readLine();
            final Double TEMPERATURE_CELSIUS = Double.parseDouble(MESSAGE);

            // Richiesta del servizio remoto: conversione da Cels a Fahr
            final Double TEMPERTURE_FAHRENHEIT = TEMPERATURE_CONVERTION_SERVICE.cels2Fahr(TEMPERATURE_CELSIUS);

            // Interazione con l'utente UI
            System.out.println(TEMPERATURE_CELSIUS + " °C = " + TEMPERTURE_FAHRENHEIT + " °F");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.exit(1);
        }
    }
}