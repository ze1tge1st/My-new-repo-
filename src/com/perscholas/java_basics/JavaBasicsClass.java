package com.perscholas.java_basics;

import static java.lang.System.*;

    public class JavaBasicsClass {
    public static void main(String[] args) {

    //Declare two int vars
    int firstInt =  3;
    int secondInt = 4;

    //add the first two var and print out result

    int sumInt = firstInt + secondInt;

    out.println("the sum of number " + firstInt  + " and " + secondInt + " equates to " + sumInt);




        double firstDouble = 3.5;
        double secondDouble = 2.4;

        //adds two numbers and store in variable
        double sumDouble = firstDouble + secondDouble;

        //print

        out.println("The sum of the double(s) " + firstDouble + " and " + secondDouble + " is " + sumDouble);



        // Declare and initialize an integer variable
        int integerNumber = 5;

        // Declare and initialize a double variable
        double doubleNumber = 4.5;

        // Add int and double together and store the result in a variable
        double sum = integerNumber + doubleNumber;

        // Print out the result
        out.println("The sum of " + integerNumber + " and " + doubleNumber + " is: " + sum);

        // Declare and initialize two integer variables

        int firstNumber = 100;
        int secondNumber = 25;

        // Determine which number is larger


        int largerNumber = Math.max(firstNumber, secondNumber);
        int smallerNumber = Math.min(firstNumber, secondNumber);

        // Divide the larger number by the smaller number and store the result in a variable
        int result = largerNumber / smallerNumber;

        // Print

        out.println("The result of dividing the larger number by the smaller number is: " + result);


        // Declare and initialize two double variables


        double firstD = 8.5;
        double secondD = 4.3;

        // Determine which number is larger
        double largerN = Math.max(firstD, secondD);
        double smallerN = Math.min(firstD, secondD);

        // Divide the larger number by the smaller number and store the result in a variable
        double results = largerN / smallerN;

        // Print out the result
        System.out.println("The result of dividing the larger number by the smaller number is: " + results);

        // Cast the result to an integer
        int castedResult = (int) results;

        // Print out the casted result
        out.println("The casted result to an integer is: " + castedResult);


        final double PI = 3.14159;
        // Calculate the circumference w/radius of 5 using the constant PI
        double radius = 10.0;
        double circumference = 2 * PI * radius;

        // Print out the result
        out.println("The circumference of a circle with radius " + radius + " is: " + circumference);

        // Product prices
        double coffeePrice = 2.50;
        double cappuccinoPrice = 3.00;
        double espressoPrice = 2.00;

        // Order quantities
        int coffeeQuantity = 3;
        int cappuccinoQuantity = 4;
        int espressoQuantity = 2;

        // Calculate subtotal
        double subtotal = (coffeePrice * coffeeQuantity) + (cappuccinoPrice * cappuccinoQuantity) + (espressoPrice * espressoQuantity);

        // Constant for sales tax
        final double SALES_TAX = 0.08; // 8% sales tax

        // Calculate total sale including sales tax
        double totalSale = subtotal * (1 + SALES_TAX);



        // Print out the results
        System.out.printf("Subtotal: $%.2f%n", subtotal);
        System.out.printf("Total Sale including 8%% sales tax: $%.2f%n", totalSale);

    }




    }




