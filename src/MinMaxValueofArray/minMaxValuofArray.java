package MinMaxValueofArray;
import java.util.Arrays;

public class minMaxValuofArray {
    public static void main(String[] args) {

        int[] list = {15, 12, 788, 1, -1, -788, 2, 0};
        int newElement = 5;
        int[] newList = Arrays.copyOf(list, list.length + 1); //1 eleman daha arttırıp listeyi kopyala.

        newList[newList.length - 1] = newElement; //son eleman olarak 5'i ekle
        System.out.println("Yeni dizi: " + Arrays.toString(newList));

        Arrays.sort(newList); //yeni listeyi kücükten buyuge sirala
        System.out.print("Yeni dizinin sirali hali : ");
        System.out.println(Arrays.toString(newList));

        int index = Arrays.binarySearch(newList, newElement); //5'in solu ve sagini bulmak icin indexini bul.
        System.out.println("Hedef elemanın indeksi: " + index);

        System.out.println("5'e en yakin kücük sayi : \n"+newList[4]+"\n5'e en yakin buyuk sayi : \n"+newList[6]);
    }
}
