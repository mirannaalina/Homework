package Homework.HWday2;

//Pick from the console a value from 0 to 5 . On the basis of the obtained value, display
//any sign. For example, for number 0, display "*", for 1 display "$" (or any other).

import java.util.Scanner;

public class Tema1 {

    public static void main (String[]args){

        Scanner sc = new Scanner(System.in);

        int valoare;

        System.out.println("zi-mi o valoare intre 0 si 5 : ");

        valoare = sc.nextInt();

        if (valoare>5){
            System.out.println("scuze, ai ales o valoare nepotrivita");
        }else if( valoare==1){

            System.out.println("$");
        }else if (valoare ==2){
            System.out.println("*");
        }else if (valoare ==3){
            System.out.println("#");
        }else if (valoare ==4){
            System.out.println("@");
        }else {
            System.out.println("5 e cea mai buna alegere :))");
        }


    }
}
