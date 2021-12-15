package com.company;

public class Android implements Device{

    public String spcsData;
    public String comboData;
    public String deviceData;
    public static int noOfDevice=10;


    @Override
    public boolean validateNoOfDevice(int num) {
        if(0<num && num <= noOfDevice){
            this.noOfDevice=noOfDevice-num;
            return true;
        }
        return false;
    }

    @Override
    public int getNoOfDeviceLeft() {
        return this.noOfDevice;
    }





    @Override
    public void getSpcsDetails(String specsData) {
        this.spcsData=specsData;

    }

    @Override
    public void getComboDetails(String comboData) {
        this.comboData=comboData;

    }

    @Override
    public String deliverProduct() {
        deviceData="Your Android Device Have\n"+this.spcsData+"\n"+this.comboData;
        return deviceData;
    }
}
