package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner firstValue;
        Scanner secondValue;
        char operation;
        Float floatFirstValue, floatSecondValue;

        Scanner scanner =new Scanner(System.in);
        System.out.print("Please enter first value: ");
        firstValue = new Scanner(System.in);
        Boolean firstValueIsFloat = firstValue.hasNextFloat();

        while (!firstValueIsFloat) {
            System.out.println("Please enter number.");
            firstValue = new Scanner(System.in);
            firstValueIsFloat = firstValue.hasNextFloat();
        }
        floatFirstValue = firstValue.nextFloat();

        System.out.print("Please enter second value: ");
        secondValue = new Scanner(System.in);
        Boolean secondValueIsFloat = secondValue.hasNextFloat();

        while (!secondValueIsFloat) {
            System.out.println("Please enter number.");
            secondValue = new Scanner(System.in);
            secondValueIsFloat=secondValue.hasNextFloat();
        }

        floatSecondValue = secondValue.nextFloat();

        System.out.println("Please choose an action to perform: '+', '-', '/', '*'    ");
        operation =  scanner.next().charAt(0);

        switch (operation) {
            case '+':
                System.out.println("The result is:" + (floatFirstValue + floatSecondValue));
                break;
            case '-':
                System.out.println("The result is:" + (floatFirstValue - floatSecondValue));
                break;
            case '/':
                System.out.println("The result is:" + (floatFirstValue / floatSecondValue));
                break;
            case '*':
                System.out.println("The result is:" + (floatFirstValue * floatSecondValue));
                break;
            default:
                System.out.printf("Error! operator is not correct");
                return;

        }
    }
}

