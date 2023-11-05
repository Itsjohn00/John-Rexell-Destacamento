
package com.mycompany.bmi;

import java.util.Scanner;


public class BMI {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       
        System.out.print("Input you height in meters: "); 
        double height = input.nextDouble();
        System.out.print("Input weight in kilogram: ");
        double weight = input.nextDouble();
        
        double bmi = calculateBMI(height, weight);
        
        System.out.println("Your BMI is: " + bmi);
        
    }

    public static double calculateBMI(double height, double weight) {
        return height / (height * weight);
        
    }
}
