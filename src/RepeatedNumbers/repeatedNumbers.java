package RepeatedNumbers;

import java.util.Arrays;

public class repeatedNumbers {
    static boolean isFind(int[] arr, int value){
        for (int i : arr){
            if(i == value){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
         int [] list = {3,7,3,3,2,34,10,21,1,34,10,1};
         int[] duplicate = new int[list.length];
         int startIndex = 0;

         for(int i = 0; i<list.length; i++){
               for(int j =0; j<list.length; j++) {
                   if ((i != j) && (list[i] == list[j])) {      //ayni elemanla karsılasması durumu
                           if (!isFind(duplicate, list[i])) {// i ve j birbirine esit olacagindan j de diyebilirdik.
                               if(list[i] %2 ==0) { //listenin elemanlarini kontrol icin list[i]
                                   duplicate[startIndex++] = list[i]; //listin i. degerine at.
                               }
                           }
                       break;
                   }
               }
         }
        System.out.println(Arrays.toString(duplicate));

        for(int value : duplicate){ //duplicate içindeki boş elemanlari yazdirmamak için bir dongu.
            if(value != 0){
                    System.out.println(value);
            }
        }
    }

}
