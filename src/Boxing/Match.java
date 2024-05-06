package Boxing;

public class Match {
    Boxer b1;
    Boxer b2;
    int minWeight;
    int maxWeight;


    Match(Boxer b1, Boxer b2, int minWeight, int maxWeight){
        this.b1=b1;
        this.b2=b2;
        this.minWeight=minWeight;
        this.maxWeight=maxWeight;

    }
     void run( ){
        if(isCheck()){
            if (flipCoin().equals("yazi")) { //yazi gelirse 2. boksor baslar.
                System.out.println("Yazı tura atildi ve " + flipCoin() + " geldi\n 1. boksor baslayacak.");
                while (this.b1.health > 0 && this.b2.health > 0) {
                    System.out.println("~~~~~~~YENİ ROUND~~~~~~");
                    this.b2.health = this.b1.hit(this.b2);
                    if (isWin()) {
                        break;
                    }
                    this.b1.health = this.b2.hit(this.b1);
                    if (isWin()) {
                        break;
                    }
                    System.out.println(this.b1.name + " Saglik : " + this.b1.health);
                    System.out.println(this.b2.name + " Saglik : " + this.b2.health);
                }
            }
            else{ //tura gelirse 1. boksor baslar.
                System.out.println("Yazı tura atildi ve " +flipCoin()+ " geldi\n 2. boksor baslayacak.");
                while(this.b1.health > 0 && this.b2.health > 0){
                    System.out.println("~~~~~~~YENİ ROUND~~~~~~");
                    this.b1.health = this.b2.hit(this.b1);
                    if (isWin()){
                        break;
                    }
                    this.b2.health = this.b1.hit(this.b2);
                    if (isWin()){
                        break;
                    }
                    System.out.println(this.b1.name+" Saglik : "+this.b1.health);
                    System.out.println(this.b2.name+" Saglik : "+this.b2.health);
                }
            }
        }
        else{
            System.out.println("Sporcularin skletleri uymuyor.");
        }
     }
      String flipCoin(){ //yazi tura atiliyor.
         double randCoin = Math.random()*100;
         if ( randCoin >= 0 && randCoin <= 50){
             String sonuc1 = "yazi";
             return sonuc1; //0-50 arasi bir sayi gelirse ilk boksor baslar.
         }
       else{
           String sonuc2 = "tura";
           return sonuc2;
         }

     }
     boolean isCheck(){ //boksorlerin sklet ve kilo kontrolleri.
        return (this.b1.weight >= minWeight && this.b1.weight <= maxWeight) && (this.b2.weight >= minWeight && this.b2.weight <= maxWeight);
     }
     boolean isWin(){ //kalan cana gore kazanan yazdirilir.
        if(this.b1.health == 0){
            System.out.println(b2.name+ " kazandi ! ");
            return true;
        }
         if(this.b2.health == 0){
             System.out.println(b1.name+ " kazandi ! ");
             return true;
         }
         return false;
     }
}
