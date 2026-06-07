package com.programmingII;

public class TestTV {
    public static void main(String[] args) {
        TV myTv=new TV();
        TV yourTv = new TV();
        myTv.turnOn();
        //myTv.setChannel(101);

        myTv.setVoleme(5);
        //myTv.channelUp();
        myTv.volumeUp();
        yourTv.turnOn();
        yourTv.setChannel(111);
        yourTv.setVoleme(7);

        System.out.println(myTv.on);
        System.out.println(myTv.channel);
        System.out.println("volume level on my tv "+myTv.volumeLevel);
        System.out.println("volume level on your tv "+yourTv.volumeLevel);
        System.out.println(yourTv.on);
        System.out.println(yourTv.channel);
    }
}
