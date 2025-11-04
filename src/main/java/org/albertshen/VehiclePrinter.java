package org.albertshen;

public class VehiclePrinter<T extends Vehicle> {
    T vehicle;

    VehiclePrinter(T vehicle) {
        this.vehicle = vehicle;
    }

    public void print() {
        System.out.println("Vehicle Brand: " + vehicle.getBrand());
        System.out.println("Vehicle Color: " + vehicle.getColor());
    }
}
