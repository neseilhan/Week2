package SortingValuesInArray;
import java.util.Arrays;
import java.util.Scanner;

public class sortingValuesInArray {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.println("Lutfen olusturmak istediginiz dizinin boyutunu giriniz : ");
        int lengthOfArray = inp.nextInt();
        int[] list = new int[lengthOfArray];
        System.out.println("Dizi boyutu : "+lengthOfArray);

        for (int i = 0; i < lengthOfArray; i++) {  //tek tek elemanlari al ve "list" adli arrray'e at
            System.out.print("Sayilar :  " + (i + 1) + ": ");
            list[i] = inp.nextInt();
        }

        Arrays.sort(list); //kucukten buyuge sirala ve yazdir.
        System.out.println("Sirali dizi : "+Arrays.toString(list));

    }
}
