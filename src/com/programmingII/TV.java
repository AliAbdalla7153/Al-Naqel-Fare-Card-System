package com.programmingII;

public class TV {
    int channel=7;
    int volumeLevel;
    boolean on;

    public TV(){

    }

    public void turnOn(){
        this.on=true;
    }
    public void turnOff(){
        this.on=false;
    }

    public void setChannel(int channelNumber){
        channel=channelNumber;
    }
    public void setVoleme(int volumeLevel){

        this.volumeLevel=volumeLevel;
    }
    public void channelUp(){
        channel=channel+1;
    }
    public void channelDown(){
        channel=channel-1;
    }

    public void volumeUp(){
        volumeLevel=volumeLevel+1;
    }

    public void volumeDown(){
        volumeLevel=volumeLevel-1;
    }
}
