package com.pluralsight;

import java.util.Scanner;

public class StaticMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your  name :");
        System.out.println("Prefix (Not requried) ");
        String prefix = input.nextLine();

        System.out.println("First Name (required) ");
        String firstName = input.nextLine();

        System.out.println("Middle name (Not required) ");
        String middleName = input.nextLine();

        System.out.println("Last name (required) ");
        String lastName = input.nextLine();

        System.out.println("Suffix name (Not required) ");
        String Suffix = input.nextLine();

        System.out.println(NameFormatter.format(prefix,firstName,middleName,lastName,Suffix));
    }
}
