package com.company;

public class Hp extends Laptop{
    private String ram;
    private String processor;
    Hp(String ram, String processor){
        this.ram=ram;
        this.processor=processor;

    }

    @Override
    public String toString() {
        return "Hp{" +
                "ram='" + ram + '\'' +
                ", processor='" + processor + '\'' +
                '}';
    }

    @Override
    public String getConfiguration() {
        return "Hp config is Ram "+this.ram+" and the processor type is"+this.processor;
    }
}
