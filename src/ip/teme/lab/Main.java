package ip.teme.lab;

import ip.teme.lab.exceptions.BatteryException;
import ip.teme.lab.exceptions.FuelException;
import ip.teme.lab.interfaces.IEngine;
import ip.teme.lab.vehicle.ElectricVehicle;
import ip.teme.lab.vehicle.GasolineVehicle;
import ip.teme.lab.vehicle.Vehicle;

/**
 * Created by Andrei on 01.11.2014.
 *
 * This is the main class
 */
public class Main {
    /**
     * This is the entry point in project
     *
     * @param args is a vector of arguments to the executable
     */
    public static void main(String[] args){
        IEngine daciaVehicle=new GasolineVehicle("Dacia Logan");
        Vehicle mazdaVehicle=new ElectricVehicle("Mazda");
        ElectricVehicle hyundaiVehicle=new ElectricVehicle("Hyundai");
        GasolineVehicle renaultVehicle=new GasolineVehicle("Renault");

        ((GasolineVehicle)daciaVehicle).chargeFuel(25);
        try {
            daciaVehicle.battery();
        } catch (BatteryException e) {
            System.out.println("Exception while trying to start the vehicle: "+((GasolineVehicle) daciaVehicle).getVehicleName()+" "+e.getMessage());
        }

        try {
            daciaVehicle.fuel();
        } catch (FuelException e) {
            System.out.println("Exception while trying to start the vehicle: "+((GasolineVehicle) daciaVehicle).getVehicleName()+" "+e.getMessage());
        }

        ((ElectricVehicle)mazdaVehicle).chargeFuel(100);
        try {
            ((ElectricVehicle)mazdaVehicle).fuel();
        } catch (FuelException e) {
            e.printStackTrace();
        }

        hyundaiVehicle.chargeFuel(100);
        try {
            hyundaiVehicle.fuel();
        } catch (FuelException e) {
            e.printStackTrace();
        }

        renaultVehicle.chargeFuel(35);
        try {
            renaultVehicle.fuel();
        } catch (FuelException e) {
            e.printStackTrace();
        }
    }
}
