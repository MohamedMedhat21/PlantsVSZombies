package com.uni4team;

abstract public class SideBar {
    //private imageOn;
    //private imageOff;
    private boolean available;
    private int xAxis, yAxis;
    private int costOfPlant;
    public SideBar(int xAxis, int yAxis, int costOfPlant /*, imageOn, imageOff*/) {
        this.xAxis = xAxis;
        this.yAxis = yAxis;
        this.costOfPlant = costOfPlant;
        /*imageOn, imageOff*/
    }
    public void setAvailable(boolean available) {
        this.available = available;
        if (this.available == true) {
            //imageOn
        }
        else {
            //imageOff
        }
    }
}
