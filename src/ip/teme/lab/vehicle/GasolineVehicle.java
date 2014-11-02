package ip.teme.lab.vehicle;

import ip.teme.lab.exceptions.BatteryException;
import ip.teme.lab.exceptions.FuelException;
import ip.teme.lab.interfaces.IEngine;

/**
 * Created by Andrei on 02.11.2014.
 *
 * This is the class for a gasoline vehicle
 */
public class GasolineVehicle extends Vehicle implements IEngine {

    /*The consumption per hundred kilometres*/
    private int fuelConsumption;

    /*The use of vehicle*/
    private boolean usedVehicle = false;

    /*The fuel left in the thank*/
    private int fuelLeft;


    public GasolineVehicle(String vName) {
        super(vName);
    }

    @Override
    public void fuel() throws FuelException {
        if (fuelLeft == 0)
            throw new FuelException("Tank is empty!");
        System.out.println(getVehicleName()+" has "+fuelLeft + " l gas remained");
    }

    @Override
    public void battery() throws BatteryException {
        if (!checkBattery())
            throw new BatteryException("Battery is dead!");
        System.out.println("Battery is ok for "+getVehicleName());
    }

    @Override
    public boolean checkIfNewVehicle(String vName) {
        return usedVehicle = (getVehicleFabricationYear() < 2014);
    }

    @Override
    public void chargeFuel(int fuelQuantity){
        fuelLeft=fuelQuantity;
    }
}
