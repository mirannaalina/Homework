package Homework;


import java.util.Scanner;

public class Tema1
{
    public static void main (String[] args) {

        Scanner sc =  new Scanner(System.in);

        int a,b;


        System.out.println("scrie primul numar: ");

        a= sc.nextInt();

        System.out.println("scrie al doil;ea");

        b = sc.nextInt();


        if(a%b==0 || b%a==0){
            System.out.println("true");
        }else{
            System.out.println("false");
        }

    }
}
