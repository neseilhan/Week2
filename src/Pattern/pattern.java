package Pattern;

import java.util.Scanner;

public class pattern {

    public static void pat(int n) {

        if(n<=0){
            System.out.print(n +" ");
            return;
        }

        System.out.print(n + " ");
         pat(n - 5);
        System.out.print(n + " ");
    }

    public static void main(String[]Args){
        Scanner inp = new Scanner(System.in);
        System.out.println("Desen icin bir n sayisi girin: ");
        int n = inp.nextInt();
        pat(n);


    }
}
