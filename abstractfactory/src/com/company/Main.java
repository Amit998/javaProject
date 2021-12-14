package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Device dell=FactoryGenerator.getFactory(FactoryType.LaptopFactory).getGadget(DeviceType.Dell);
        System.out.println(dell.getDetails());
    }
}
