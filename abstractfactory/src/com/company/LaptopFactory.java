package com.company;

public class LaptopFactory extends AbstractDeviceFactory{

    @Override
    Device getGadget(DeviceType deviceType) {
        switch (deviceType){
            case Hp:
                return new Hp("8 GB","Intel","AMD");
            case Dell:
                return new Dell("2GB","INTEL","RIGON");
        }

        return null;
    }
}
