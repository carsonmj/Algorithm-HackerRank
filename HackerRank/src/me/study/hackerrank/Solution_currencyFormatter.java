package me.study.hackerrank;
import java.util.*;
import java.text.*;

public class Solution_currencyFormatter {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
//        String amount = payment+"";
//        String us = String.format("$%,d", amount);
//        String india = String.format("$%,d", amount);
//        String china = String.format("$%,d", amount);
//        String france = String.format("$%,d", amount);
        Locale INDIA = new Locale("en", "IN");
        
        
        String us = NumberFormat.getCurrencyInstance(Locale.US).format(payment);
        String china = NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment);
        String india = NumberFormat.getCurrencyInstance(INDIA).format(payment);
        String france = NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment);

        // Write your code here.
        
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}

