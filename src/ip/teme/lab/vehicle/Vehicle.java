package ip.teme.lab.vehicle;

/**
 * Created by Andrei on 02.11.2014.
 *
 * This is the abstract vehicle class
 */
public abstract class Vehicle {

    /*The name of the vehicle*/
    private String vehicleName;

    /*The fabrication year of vehicle*/
    private int fabricationYear;

    /*The battery*/
    private boolean batteryOk=true;

    /**
     * The constructor that initializes with the name
     * @param vName is the name of the vehicle
     */
    public Vehicle(String vName){
        this.vehicleName=vName;
    }

    /**
     * This method must be overwritten by all subclasses
     *
     * @param vName is the name of the vehicle
     * @return <code>True</code> if the vehicle is new, <code>False</code> otherwise
     */
    public abstract boolean checkIfNewVehicle(String vName);

    /**
     * This method must be overwritten by all subclasses
     *
     * @param fuelQuantity is the charge quantity for the vehicle
     */
    public abstract void chargeFuel(int fuelQuantity);

    /**
     * This method gets the name of the vehicle
     * @return The name of the vehicle
     */
    public String getVehicleName(){
        return this.vehicleName;
    }

    /**
     * This method gets the fabrication year of the vehicle
     * @return The fabrication year of the vehicle
     */
    public int getVehicleFabricationYear(){
        return this.fabricationYear;
    }

    /**
     * This method checks if the battery is ok
     */
    public boolean checkBattery(){
        return this.batteryOk;
    }
}
