package Homework;


//Folosing instructiunea switch sa se scrie un program care
//        citeste un nr de la 1-5 si afiseaza pentru:
//        1 -> *
//        2 -> $
//        3 -> ^
//        4 -> !
//        5 -> ?

import java.util.Scanner;

public class Tema9 {

    public static void main (String[]args){

        Scanner sc = new Scanner(System.in);

        int numar ;

        System.out.println("Zi un nr intre 1 si 5: ");

        numar= sc.nextInt();

        switch (numar){
            case 1:
                System.out.println("*");
                break;
            case 2:
                System.out.println("$");
                break;
            case 3:
                System.out.println("^");
                break;
            case 4:
                System.out.println("!");
                break;
            case 5:
                System.out.println("?");
                break;
            default :
                System.out.println("ai ales un nr incorect ;)");
        }

        System.out.printf("%d",6);
    }

}
