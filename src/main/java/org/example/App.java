package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int valueA = 20;
        int valueB = 15;

        System.out.println("Console Calculator");
        System.out.println("==================");
        System.out.println();

        System.out.println("Summe: " + valueA + " + " + valueB + " = " + calculator.summe(20,15));
    }
}
