package Homework.HWday2;

import java.util.Scanner;

public class Tema13 {

    public static void main (String []args){

        Scanner sc = new Scanner(System.in);

        int n, contor =0;

        System.out.println("n=");

        n =  sc.nextInt();

        for(int i=1; i<n;i++){
            if(n % i == 0){
                contor++;
            }
        }
        System.out.println(contor);
    }
}
