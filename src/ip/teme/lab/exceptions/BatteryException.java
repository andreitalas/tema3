package ip.teme.lab.exceptions;

/**
 * Created by Andrei on 02.11.2014.
 *
 * This is an exception thrown by {@link ip.teme.lab.interfaces.IEngine} interface
 */
public class BatteryException extends Exception {

    public BatteryException(String message){
        super(message);
    }
}
