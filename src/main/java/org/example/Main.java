package org.example;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*Setup any variables you need and call your methods
         * here in the main method */
        Scanner purchasePrice = new Scanner(System.in);
        inputPurchasePrice();
        double InputPurchasePrice = inputPurchasePrice();
        double totalTax = calculateTax(20, 0.06);
        double totalPrice = calculateTotal(50, 45);
        double stateTax = 0.02;
        double countyTax = 0.04;
        double allTotal = displayTotals(purchasePrice, totalTax, totalPrice, stateTax, countyTax);

    }

    /* Write a method called inputPurchasePrice that
    *  takes the user input for price, converts to
    *  a double, and returns the price
    * */
    public static double inputPurchasePrice(){
        System.out.println("Input a price: ");
        Scanner userInput = new Scanner(System.in);
        return Double.parseDouble(userInput.nextLine());
    }

    /* Write a method called calculateTax that
     * accepts price and tax rate as parameters and
     * calculates and returns the tax
     * */
    public static double calculateTax(double Price, double totalTax){
        double total = Price + (totalTax / 100);
        return total;
        

    }
    /* Write a method called calculateTotal that
     * accepts two double values nd calculates and
     * returns the total
     * */
    public static double calculateTotal(double num1, double num2){
       double total = num1 + num2;
       return total;
    }

    /* Write a method called displayTotals that takes
    *  purchasePrice, stateTax, countyTax, totalTax and totalPrice
    *  as parameters. Output using decimal formatter amd printf */
    public static double displayTotals(Scanner purchasePrice, double stateTax, double countyTax, double totalTax, double totalPrice){
        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        System.out.printf(String.valueOf(purchasePrice), totalPrice);
        System.out.printf(String.valueOf("Your total tax is: $%.2f"), stateTax, countyTax, totalTax);

        return stateTax;
    }

}