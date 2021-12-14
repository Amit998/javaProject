package com.company;

public class Dell extends Device{
    private String ram;
    private String processor;
    private String gpu;

    public Dell(String ram,String processor,String gpu){
        this.ram=ram;
        this.processor=processor;
        this.gpu=gpu;
    }

    @Override
    public String getDetails() {
        return " config Ram size is"+ this.ram+" and processor "+this.processor+" And THe Gpu Is "+this.gpu;
    }

    @Override
    public String toString() {
        return "Dell{" +
                "ram='" + ram + '\'' +
                ", processor='" + processor + '\'' +
                '}';
    }
}
