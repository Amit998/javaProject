package com.company;

public class Client {
    public static void main(String[] args){
        Device dell=FactoryGenerator.getFactory(FactoryType.LaptopFactory).getGadget(DeviceType.Dell);
        System.out.println(dell.getDetails());
    }
}
