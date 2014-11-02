package ip.teme.lab.vehicle;

import ip.teme.lab.exceptions.BatteryException;
import ip.teme.lab.exceptions.FuelException;
import ip.teme.lab.interfaces.IEngine;

/**
 * Created by Andrei on 02.11.2014.
 *
 * This class is for an electric vehicle
 */
public class ElectricVehicle extends Vehicle implements IEngine {

    /*The autonomy of the vehicle*/
    private int autonomyVehicle;

    /*The use of vehicle*/
    private boolean usedVehicle = false;

    public ElectricVehicle(String vName) {
        super(vName);
    }

    @Override
    public void fuel() throws FuelException {
        if (autonomyVehicle == 0)
            throw new FuelException("Autonomy was consumed!");
        System.out.println(autonomyVehicle + " km autonomy remained for "+getVehicleName());
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
        autonomyVehicle=fuelQuantity;
    }
}
