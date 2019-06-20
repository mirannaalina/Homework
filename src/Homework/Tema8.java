package Homework;

//
//Folosing instructiunea switch sa se scrie un program care citeste
//        caractere de la tastatura pana cand se introduce 'q'
//        Si afiseaza la final toate caracterele citite.
//        Indiciu: acest switch are un singur case si un default

import java.util.ArrayList;
import java.util.Scanner;

public class Tema8 {

    public static void main (String[]args){

        Scanner sc = new Scanner(System.in);


       while (true) {
           String str = sc.nextLine();
           System.out.println("scrie ceva: ");

           switch (str) {
               case "q": {
                   System.out.println("q");

                   break;
               }
               default:
                   //System.exit(0);
                   break;

           }
           //break;


       }


    }

    int Functie(){
        return 0;
    }
    void Goala(){

    }
    void parametrii (int a, float b){
        a=4;
        b=7.0f;
        int[]array = new int[4];
        System.out.println(array.length + a + b);
    }


}
