package Calculator;

import java.util.Scanner;

public class calculator {

    static  int sum(int a, int b){
        int result = a+b;
        System.out.println("Toplam : "+result);
        return result;
    }
    static  int minus(int a, int b){
        int result = a-b;
        System.out.println("Fark : "+result);
        return result;
    }
    static  int times(int a, int b){
        int result = a*b;
        System.out.println("Carpim : "+result);
        return result;
    }
    static  int division(int a, int b){
        if(b == 0){
            System.out.println("ikinci sayi sifirdan farkli olmali.");
            return 0;
        }
        int result = a/b;
        System.out.println("Bolum : "+result);
        return result;
    }
    static int power(int a, int b){
        int result = 1;
        for(int i=1; i<= b; i++){
            result *= a;
        }
        return result;
    }
    static  int mod(int a, int b){
        int result = a%b;
        System.out.println("Mod : "+result);
        return result;
    }
    static  void rectangle(int a, int b){
        System.out.println("Cevresi : "+(2* (a+b)));
        System.out.println("Alanı : "+(a*b));

    }


    public static void main(String[]Args){
        Scanner inp = new Scanner(System.in);
        int select;
        String Menu = "1- Toplama islemi\n"
                +"2- Cıkarma islemi\n"
                +"3- Carpma islemi\n"
                + "4- Bolme islemi\n"
                +"5- Uslu sayi hesaplama\n"
                +"6- Mod alma\n"
                +"7- Dikdortgen alan ve cevre hesabı\n"
                +"0- Cikis yap";

        while(true) {
            System.out.println(Menu);
            System.out.println("Bir islem seciniz :");
            select = inp.nextInt();

            if(select == 0){
                break;
            }

            System.out.println("ilk sayi :");
            int a = inp.nextInt();
            System.out.println("ikinci sayi :");
            int b = inp.nextInt();

            switch (select){
                case 1:
                    sum(a,b);
                    break;
                case 2:
                    minus(a,b);
                    break;
                case 3:
                    times(a,b);
                    break;
                case 4:
                    division(a,b);
//                    if(division((a,b)==0 ){
//                        System.out.println("ikinci sayi sifirdan farkli olmali");
//                    }
                    break;
                case 5:
                    System.out.println("Us hesabi : "+ power(a,b));
                    break;
                case 6:
                    mod(a,b);
                    System.out.println("Mod islemi : "+ mod(a,b));
                    break;
                case 7:
                    rectangle(a,b);
                    break;
                default:
                    System.out.println("Gecersiz islem girdiniz.");
            }

        }
        System.out.println("Güle Güle :)");

    }
}
