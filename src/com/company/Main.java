package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        float weightFirstBoxer = (float) 78.2;
        float weightSecondBoxer = (float) 82.7;
        float totalWeight = weightFirstBoxer + weightFirstBoxer;
        System.out.println("Общий вес боксёров " + totalWeight + " кг");
        float weightDifference = weightFirstBoxer - weightSecondBoxer;
        System.out.println("Разница в весе боксёров " + weightDifference + " кг");
    }
}
