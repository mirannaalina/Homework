package Homework.HWday2;

public class Tema10 {

    public static void main (String[]args){

        int suma = sumaCifrelor(3456);
        System.out.println(suma);

    }

    static int sumaCifrelor(int n){
        int suma =0;

        while (n >0)
        {
            int ultimacifra = n% 10;
            suma = suma + ultimacifra;
            n = n /10;

        }
        return suma;
    }
}
