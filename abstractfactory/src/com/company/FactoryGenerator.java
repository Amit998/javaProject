package com.company;

public class FactoryGenerator {
    public static AbstractDeviceFactory getFactory(FactoryType factoryType){
        switch (factoryType){
            case LaptopFactory:
                return new LaptopFactory();
            case MobileFactory:
                return new  MobileFactory();

        }
        return null;

    }
}
