package com.company;

public class Nokia extends Device{
    private String ram;
    private String processor;

    public Nokia(String ram,String processor){
        this.ram=ram;
        this.processor=processor;
    }

    @Override
    public String getDetails() {
        return " config Ram size is"+ this.ram+" and processor "+this.processor;
    }

    @Override
    public String toString() {
        return "Nokia{" +
                "ram='" + ram + '\'' +
                ", processor='" + processor + '\'' +
                '}';
    }
}
