package Week2;

import java.util.Scanner;

public class Operator_Scanner {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num1 , num2, result;



        System.out.println("Enter First Number : " );
        num1 = input.nextInt();

        System.out.println("Enter Secould Number : " );
        num2 = input.nextInt();

        result = num1 + num2;
        System.out.println( "The sum is : " + result );


        result = num1 - num2;
        System.out.println("Sub : " + result );

        result = num1 * num2;
        System.out.println( "Multiplication : " + result );

         double result2 = (double) num1 / num2;
        System.out.println( "Devide : " + result2 );

        result = num1 % num2;
        System.out.println( "Remainder : " + result );



    }



}




