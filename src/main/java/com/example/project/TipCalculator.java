package com.example.project;

public class TipCalculator {
    //WRITE YOUR PROGRAM IN calculateTip
    public static String calculateTip(int people, int percent, double cost) { //You must use these  variable in your calculations
        //DO NOT DELETE ANY OF THE CODE BELOW      
        StringBuilder result = new StringBuilder();
        
        double tip = percent * 0.01 * cost;
        double totalBill = tip + cost;
        double perBeforeCost = cost / people;
        double tipPerPerson = tip / people;
        double perAfterCost = totalBill / people;

        /* learned to round with "double roundOff = (double) Math.round(a * 100) / 100"
        got it from here: https://stackoverflow.com/questions/11701399/round-up-to-2-decimal-places-in-java*/
        double roundedTip = (double)Math.round(tip * 100.0) / 100.0;
        double roundedBill = (double)Math.round(totalBill * 100.0) / 100.0;
        double roundedperBeforeCost = (double)Math.round(perBeforeCost * 100.0) / 100.0;
        double roundedtipPerPerson = (double)Math.round (tipPerPerson * 100.0) / 100.0;
        double roundedperAfterCost = (double)Math.round(perAfterCost * 100.0) / 100.0;

        result.append("-------------------------------\n");
        result.append("Total bill before tip: " + "$" + cost + "\n"); //concatenate to this string. DO NOT ERASE AND REWRITE
        result.append("Total percentage: " + percent + "%" + "\n");
        result.append("Total tip: " + "$" + roundedTip + "\n");
        result.append("Total Bill with tip: " + "$" + roundedBill + "\n");
        result.append("Per person cost before tip: " + "$" + roundedperBeforeCost + "\n");
        result.append("Tip per person: " + "$" + roundedtipPerPerson + "\n");
        result.append("Total cost per person: " + "$" + roundedperAfterCost + "\n");
        result.append("-------------------------------\n");


        return result.toString();
    }
     //TEST YOUR PROGRAM IN main
     public static void main(String[] args) {
        //try different values for people, percent, and cost to test your program before running test cases
        int people = 12; 
        int percent = 15;
        double cost = 566.97;              
        System.out.println(calculateTip(people, percent, cost));
    }
}
        
