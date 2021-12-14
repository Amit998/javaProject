package com.company;

public class MobileFactory extends AbstractDeviceFactory{

    @Override
    Device getGadget(DeviceType deviceType) {
        switch (deviceType){
            case Hp:
                return new Nokia("8 GB","Intel");
            case Dell:
                return new OnePlus("2GB","INTEL");
        }

        return null;
    }
}
