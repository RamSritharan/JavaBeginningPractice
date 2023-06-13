package org.example;
import java.util.Scanner;


public class Exercise6 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.print("Input first number");
        int firstNumber = in.nextInt();

        System.out.print("Input second number");
        int secondNumber = in.nextInt();

        System.out.print(firstNumber+secondNumber);
        System.out.print(firstNumber-secondNumber);
        System.out.print(firstNumber*secondNumber);
        System.out.print(firstNumber/secondNumber);
        System.out.print(firstNumber % secondNumber);



    }
}
