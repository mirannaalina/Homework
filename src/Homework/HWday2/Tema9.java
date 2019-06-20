package Homework.HWday2;

public class Tema9 {

    public static void main (String[]args){

        int cifre = metodacucifre(432);
        System.out.println(cifre);
    }



  static int metodacucifre (int n){

        int nr =1;

        while(n>9) {
            n = n / 10;
            nr++;
        }
        return nr;
    }
}
