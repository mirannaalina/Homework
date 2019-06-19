package Homework;

//Fie doua numere a si b sa se returneze
//-suma daca a < b
//sau
//-media daca b >= a (mai mare sau egal)
//
//Exemplu: a = 2 si b = 5 -> output: a+b      (suma)
//     a = 6 si b = 2 -> output: (a+b)/2  (media)


import java.util.Scanner;

public class Tema4 {

    public static void main (String[]args){

        int a,b;

        Scanner sc = new Scanner(System.in);

        System.out.println("primul numar");
        a = sc.nextInt();
        System.out.println("al doilea nr");
        b = sc.nextInt();

        int sum = a+b;
        int medie = (a+b)/2;

        if (a<b){
            System.out.println("Suma este " + sum);
        }else{
            System.out.println("Media este " + medie);
        }

    }
}
