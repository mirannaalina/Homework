package Homework;

import java.util.Scanner;

public class Tema7 {

    public static void main (String[]args){

        Scanner sc = new Scanner(System.in);

        int n;

        System.out.println("n=");
        n = sc.nextInt();

        for (int i=1;1<n;i++){
            if(n% i ==0){
                System.out.println(i);
            }
        }

    }
}
