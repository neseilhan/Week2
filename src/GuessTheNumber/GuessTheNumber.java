package GuessTheNumber;

import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class GuessTheNumber {

    public static void main(String[] args) {
        Random rand = new Random();
        Scanner inp = new Scanner(System.in);
        int number = rand.nextInt(100);
        int[] wrong = new int[5]; //yanlis girilen sayilar icin bir dizi olusturuldu.
        boolean isWin = false;
        boolean isWrong = false;
        //veya int number = (int) ()Math.random () * 100);

        int right = 0;
        int selected;
        System.out.println(number);

        while (right < 5) {
            System.out.print("Lütfen tahmininizi giriniz : ");
            selected = inp.nextInt();

            if (selected < 0 || selected > 99) {
                System.out.println("Lütfen 0-100 arasında bir sayi giriniz.");
                if (isWrong) {
                    right++;
                    System.out.println("Hatali giris yaptiniz. Kalan hakkiniz : " + (5 - right));
                } else {
                    isWrong = true;
                    System.out.println("Bir sonraki hatalı girişinizde hakkınız azalacaktir.");
                }
                continue;
            }

            if (selected == number) {
                System.out.println("Tebrikler, doğru tahmin ! Tahmin ettiğini sayı : " + number);
                isWin = true;
                break;
            } else {
                System.out.println("Hatalı bir sayı girdiniz !");
                if (selected > number) {
                    System.out.println(selected + " sayısı, gizli sayıdan büyüktür.");
                } else {
                    System.out.println(selected + " sayısı, gizli sayıdan küçüktür.");
                }

                wrong[right++] = selected; //yanlis girilen sayilari bir arrayde tutuyoruz.
                System.out.println("Kalan hakkiniz : " + (5 - right));
            }
        }



        if (!isWin) {
            System.out.println("Kaybettiniz ! ");
            if (!isWrong) {
                System.out.println("Tahminleriniz : " + Arrays.toString(wrong));
            }
        }
    }

}
