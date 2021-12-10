package com.company;

public class Mac extends Laptop{
    private String ram;
    private String processor;
    Mac(String ram, String processor){
        this.ram=ram;
        this.processor=processor;

    }

    @Override
    public String toString() {
        return "Mac{" +
                "ram='" + ram + '\'' +
                ", processor='" + processor + '\'' +
                '}';
    }

    @Override
    public String getConfiguration() {
        return "Mac config is Ram "+this.ram+" and the processor type is"+this.processor;
    }
}
