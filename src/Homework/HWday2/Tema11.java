package Homework.HWday2;

//Sa se citeasca pe rand numele apoi prenumele si sa se afiseze numele complet

import java.util.Scanner;

public class Tema11 {

    public static void main (String[]args){

        Scanner sc = new Scanner(System.in);

        String nume;
        String prenume;

        System.out.println("zi-mi numele tau: ");

        nume= sc.nextLine();

        System.out.println("zi-mi prenumele tau: ");

        prenume=sc.nextLine();

        System.out.println(nume+" "+prenume);
    }
}
