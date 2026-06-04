package com.programmingII;

public class Circle {
    public double radius;
    static int numberOfObjects;
    public Circle(){}
    public Circle(double newRadius){

       this.radius=newRadius;
       numberOfObjects=numberOfObjects+1;

    }

  public double getArea(){

        return 3.14*radius*radius;
    }
}
