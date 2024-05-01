package Pow;

import java.util.Scanner;

public class pow {
    public static int power(int base, int expo){
        if(expo == 0) return 1;// üs 1den kücükse 1 dondur.
        return base * power(base,expo-1); //ussu 1 azaltarak kendiyle carpar

    }
    public static void main(String[] Args){
        Scanner inp = new Scanner(System.in);
        System.out.println("Taban sayisi:"); //taban ve us sayilarini alır.
        int base = inp.nextInt();
        System.out.println("Us sayisi:");
        int expo = inp.nextInt();

        System.out.print("Sonuc: ");
        System.out.println(power(base,expo)); //sonuc icin method cagirilir.

    }
}
