package com.pluralsight;

import java.util.ArrayList;

public class Dealership {
    private String name;
    private String address;
    private String phone;

    ArrayList<Vehicle> inventory;



    public Dealership(String name, String address, String phone){
        this.name = name;
        this.address = address;
        this.phone =  phone;
        inventory = new ArrayList<>();
    }
    public void addVehicle(Vehicle vehicle){
        inventory.add(vehicle);
    }
    public String getAllVehicles(){
        return getAllVehicles();
    }
    public String getVehiclesByPrice(){
        return null;
    }
    public String getVehiclesByMakeModel(){
        return null;
    }
    public String getVehiclesByYear(){
        return null;
    }
    public String getVehiclesByColor(){
        return null;
    }
    public String getVehiclesByMileage(){
        return null;
    }
    public String getVehiclesByType(){
        return null;
    }
    public void removeVehicle(){

    }



}
