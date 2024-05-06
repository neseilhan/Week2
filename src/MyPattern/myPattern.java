package MyPattern;
import java.util.Scanner;

public class myPattern {
static int temp=0;

    public static void pat(int n) {
            System.out.print(n + " ");
            if (temp < n) { //kıyaslama yapabilmek icin basta bir temp degiskeni atadık.
                pat(n - 5); //method 0 ya da negatif sayıya kadar azaltır.

            }
            if (n == 0 || n<0 ) {
                return; //return calıstıgında method tersten yazdrımaya baslayacak.
            }
            System.out.print(n + " ");
    }
    public static void main(String[]Args){
        Scanner inp = new Scanner(System.in);

        System.out.println("Desen icin bir n sayisi girin: ");
        int number = inp.nextInt();
        pat(number); //yazdirma islemini method icinde yaptigimiz icin sadece methodu cagirdik.

    }
}
