package com.company;

public interface Device {
    public void getSpcsDetails(String specsData);
    public void getComboDetails(String comboData);
    public String deliverProduct();
    public boolean validateNoOfDevice(int num);

    public int getNoOfDeviceLeft();


}
