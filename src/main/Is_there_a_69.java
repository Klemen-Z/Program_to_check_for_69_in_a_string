package main;

import java.util.Scanner;

public class Is_there_a_69 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Insert String to check for 69");
        String str = sc.nextLine();
        if(str.contains("69")){
            System.out.println("The input contains 69 starting at char (no spaces counted): " + str.indexOf("69"));
        } else {
            System.out.println("The input does not contain 69");
        }
    }
}
