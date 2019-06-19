package Homework;

//Se da un numar n. Sa se afiseze a doua cifra a numarului
  //      sau prima daca nu are decat o cifra

import java.util.Scanner;

public class Tema6 {

    public static void main (String[]args){

        int nr ;

        Scanner sc = new Scanner (System.in);

        System.out.println("zi un nr ");

        nr = sc.nextInt();

       int  reversed = 0;

      // ???????????????????????
       while (nr !=0){
           int digit =  nr %10;
           reversed = reversed *10 + digit;
           nr /= 10;
       }


        System.out.println(reversed);

    }
}
