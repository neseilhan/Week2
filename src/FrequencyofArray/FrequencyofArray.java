package FrequencyofArray;

public class FrequencyofArray {

    public static void main(String[] args) {
        int [] list = {3,7,3,3,2,34,10,21,1,34,10,1};

        for(int i =0; i<list.length; i++){
            int  counter=1; //counter basta 1 verildigi icin her sayi en az 1 kere yazilir.
            for(int j = i+1; j<list.length; j++){ //i+1 diyerek i'nin j'ye esit olmamasini sagladik.
                if(list[i] == list[j]){
                    counter++; //ayni sayiyi buldugunda counter 1 artar.
                }
            }

            if(counter >= 1){
                boolean isCheck = false;
                for(int k=0; k<i; k++){
                    if(list[k] == list [i]){ //sayilarin tekrar tekrar yazilmasini onlemek icin kontrol.
                        isCheck = true; //sayi kontrol edildiyse true doner
                        break;
                    }
                }
                if(!isCheck) { //isCheck true ise yazdirir.
                    System.out.println(list[i] + " sayisi " + counter + " kere tekrar ediyor. ");
                }
            }


        }
    }
}
