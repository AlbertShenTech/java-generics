package org.albertshen;

public class Bus extends Vehicle implements Thing {
    String name;
    public Bus(String brand, String color, String name) {
        super(brand, color);
        this.name = name;
    }

    public String getName() { return "City Bus"; }
}
