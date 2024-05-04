package Boxing;

public class Boxer {
    String name;
    int damage;
    int health;
    int weight;
    double dodge;
    Boxer(String name, int damage, int health, int weight, int dodge){
        this.name = name;
        this.damage=damage;
        this.health=health;
        this.weight= weight;

        if(dodge >= 0 && dodge <= 100){ //dodge degeri kontrolu.
            this.dodge = dodge;
        }
        else{
            this.dodge = 0;
        }
    }

    int hit (Boxer opponent){ //rakibin hasar alma ve kacinma durumlari.
        System.out.println(this.name + " => " +opponent.name + "'a " +  this.damage + " kadar hasar verdi.");
        if(opponent.isDodge()){
            System.out.println(opponent.name+" gelen hasari blokladi !");
        }
        if(opponent.health - this.damage < 0){
            return 0;
        }

        return opponent.health - this.damage; //rakibin sagligindan verilen hasar cikariliyor.
    }
    boolean isDodge(){ //kacinma olasiligi 0'dan 100e kadar bir oranla rastgele doner.
        double randomNumber = Math.random()*100;
        return randomNumber <= this.dodge;
    }
}
