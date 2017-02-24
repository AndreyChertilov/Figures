package com.company;
import static java.lang.Math.*;
public class FibonachiNumber {
    public static int fibCalc(int index) {
        double fibNumber=0;
        fibNumber=(Math.pow(((1+ Math.sqrt(5))/2), index) - Math.pow(((1- Math.sqrt(5))/2), index))/ Math.sqrt(5);
        return (int) fibNumber;
    }
}
