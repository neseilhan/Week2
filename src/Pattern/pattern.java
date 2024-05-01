package Pattern;

import java.util.Scanner;

public class pattern {

    public static void pat(int n) {

        if(n<=0){ //0a geldiginde dur
            System.out.print(n +" ");
            return;
        }
        System.out.print(n + " ");
         pat(n - 5);
        System.out.print(n + " "); //tersten de gormek icin once ve sonrasına yazdırdık.
    }

    public static void main(String[]Args){
        Scanner inp = new Scanner(System.in);
        System.out.println("Desen icin bir n sayisi girin: ");
        int n = inp.nextInt();
        pat(n); //yazdirma islemini method icinde yaptigimiz icin sadece methodu cagirdik.


    }
}
