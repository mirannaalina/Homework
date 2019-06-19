package Homework;

import java.util.Scanner;


//Se da un numar n. Sa se afiseze toate numerele mai mici
//        decat n care sunt divizibile cu 3 si 7.



public class Tema3 {

    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);

        int nr,  start;

        System.out.println("zi un nr");

        nr=sc.nextInt();

        start =3*7;

//?????????????????????????????????????????????????
        while(start < nr) {
            if (start % 3 == 0 && start % 7 == 0) {
                System.out.println(start);
            }
         start++;
        }
    }

}

