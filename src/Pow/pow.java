package Pow;

import java.util.Scanner;

public class pow {
    public static int power(int taban, int us){

         int result =1;
            for (int i = 1; i <= us; i++) { //donguyle sayinin kendisiyle carpilmasi ve sonuca eklenmesi islemi
                     result *= taban;
            }

            return result;
    }
    public static void main(String[] Args){
        Scanner inp = new Scanner(System.in);
        boolean hata = false;

        do  {
            System.out.println("taban degeri giriniz : "); //taban olarak a sayisi
            int a = inp.nextInt();
            System.out.println("us degeri giriniz : "); //us olarak b sayisi
            int b = inp.nextInt();
            int newNum = power(a,b);
            if(b>0) {
                System.out.println("Sonuc : " + newNum);
                hata=false;
            }
            if(b <0){
                System.out.println("Lutfen pozitif bir deger giriniz.");
                hata = true;
            }
        }while(hata);

    }
}
