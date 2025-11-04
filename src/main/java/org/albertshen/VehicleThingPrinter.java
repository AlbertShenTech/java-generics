package org.albertshen;

public class VehicleThingPrinter<T extends Vehicle & Thing> {
    T vehicle;

    VehicleThingPrinter(T vehicle) {
        this.vehicle = vehicle;
    }

    public void print() {
        System.out.println("Vehicle Name: " + vehicle.getName());
        System.out.println("Vehicle Brand: " + vehicle.getBrand());
        System.out.println("Vehicle Color: " + vehicle.getColor());
    }
}
