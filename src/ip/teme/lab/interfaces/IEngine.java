package ip.teme.lab.interfaces;

import ip.teme.lab.exceptions.BatteryException;
import ip.teme.lab.exceptions.FuelException;

/**
 * Created by Andrei on 02.11.2014.
 *
 * This interfaces is for all vehicles
 */
public interface IEngine {
    /**
     * This is the fuel method
     */
    public void fuel() throws FuelException;

    /**
     * This is the battery exception
     */
    public void battery() throws BatteryException;
}
