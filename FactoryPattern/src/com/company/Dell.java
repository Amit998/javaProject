package com.company;

public class Dell extends Laptop{
    private String ram;
    private String processor;
    Dell(String ram, String processor){
        this.ram=ram;
        this.processor=processor;

    }

    @Override
    public String toString() {
        return "Dell{" +
                "ram='" + ram + '\'' +
                ", processor='" + processor + '\'' +
                '}';
    }

    @Override
    public String getConfiguration() {
        return "Dell config is Ram "+this.ram+" and the processor type is"+this.processor;
    }
}
