package com.programmingII;

import java.util.Scanner;

public class TakingInputAndConditions {
    public static void main(String[] args) {
     /*   Scanner scanner = new Scanner(System.in);
        int var1 = scanner.nextInt();*/
        //System.out.println(myName);

        /*HelloWorld helloWorld = new HelloWorld(22);
        
       System.out.println(helloWorld);*/

        boolean myvar= checkMaxNumber(8,7);
        System.out.println(myvar);

        int var= calculate(2,6,7);
        System.out.println(var);

        int[] myArray = new int[5];
        for (int i=0;i<myArray.length;i++){
            myArray[i] = i;
        }

        for (int i=0;i<myArray.length;i++){
            System.out.println(myArray[i]);
        }

        HelloWorld hhh = new HelloWorld(22);

        System.out.println(hhh);
    }

    public static boolean checkMaxNumber(int a, int b){
        if (a > b) {
            return true;
        }
        else {
            return false;
        }
        }

        public static int calculate(int a, int b, int c){

        return (a*b)+c;

        }


    }



