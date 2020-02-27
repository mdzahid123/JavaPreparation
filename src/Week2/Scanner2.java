package Week2;

import java.util.Scanner;

public class Scanner2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String name;

        System.out.print( "Please enter your name : ");
        name = input.nextLine();

        System.out.println("welcome : " + name);


    }
}