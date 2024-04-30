package PrimeNumber;
import java.util.Scanner;

public class primeNumber {
    static boolean isPrime (int a){

           for(int i=2; i<a; i++){
               if(a % i == 0 ){ //kendi hariç bir sayiya tam bölünüyorsa false deger donduruyoruz.
                   return false;
               }
           }

       return true;
    }
    public static void main(String[]Args){
        Scanner inp = new Scanner(System.in);

        System.out.println("Bir sayi giriniz : ");
        int a = inp.nextInt();
        if (isPrime(a)){ //kosul kontrolu yapmıyoruz boolean deger true kabul edilir.
            System.out.println("Girdiginiz sayi asaldir."); //kendinden baska sayiya tam bolunmemisse asaldir.
        }
        else {
            System.out.println("Girdiginiz sayi asal degildir.");
        }

    }
}
