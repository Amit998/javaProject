package com.company;

public class Hp extends Device{
    private String ram;
    private String processor;
    private String gpu;


    public Hp(String ram,String processor,String gpu){
        this.ram=ram;
        this.processor=processor;
        this.gpu=gpu;
    }

    @Override
    public String getDetails() {

        return " config Ram size is"+ this.ram+" and processor "+this.processor+"And The GPU is "+this.gpu;
    }

    @Override
    public String toString() {
        return "Hp{" +
                "ram='" + ram + '\'' +
                ", processor='" + processor + '\'' +
                '}';
    }
}
