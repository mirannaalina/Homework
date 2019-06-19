package Homework;

import java.util.Scanner;

//Fie doua numere a si b. Sa se determine daca reprezinta un
//patrat sau doar un dreptunghi
//Input a, b
//Output true (daca e patrat)
//sau
//Output false (daca e dreptunghi)
//Exemplu: a = 2 si b = 3 -> output: false
//         a = 5 si b = 5 -> output: true

public class Tema2 {

    public static void main (String[] args){

        Scanner sc =  new Scanner(System.in);

        int a, b;

        System.out.println("spune-mi cat de inalta este figura");

        a = sc.nextInt(); //lungimea

        System.out.println("si cat de lata??");

        b = sc.nextInt(); //latimea

        if (a<b || a>b){

            System.out.println("false = ai un dreptunghi");
        }else {
            System.out.println("true =patrat, ai laturi egale");
        }
    }
}
