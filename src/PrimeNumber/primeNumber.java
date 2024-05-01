package PrimeNumber;
import java.util.Scanner;

public class primeNumber {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Lutfen bir tamsayi giriniz : ");
        int num = inp.nextInt();

        if (isPrime(num, 2)) {
            System.out.println(num + " asal sayidir.");
        } else {
            System.out.println(num + " asal sayi degildir.");
        }
    }

    private static boolean isPrime(int num, int bolen) {
        if (num < 2) {
            return false;
        } else if (num == 2) {
            return true;
        } else if (num % bolen == 0) {
            return false;
        } else {
            return isPrime(num, bolen + 1);
        }
    }

}