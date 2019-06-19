package Homework.HWday2;

//Within a loop read text from console and print it back simple ""


import java.util.Scanner;

public class Tema4 {

    public static void main (String[]args){

        Scanner sc = new Scanner(System.in);

        String i;

        System.out.println("Scrie ceva ce voi afisa ulterior: ");

        i = sc.nextLine();

        for(int r=0;r<10;r++) {
            System.out.println(i);
        }
    }

}
