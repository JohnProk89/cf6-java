package gr.aueb.cf.ch12oopintro;

import gr.aueb.cf.ch12oopintro.model.ColorType;
import gr.aueb.cf.ch12oopintro.model.Vehicle;

public class VehicleMain {

    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle(1, "Fiat car", 0.0, ColorType.BLACK);

        vehicle.startEngine();
        vehicle.stopEngine();
    }
}
