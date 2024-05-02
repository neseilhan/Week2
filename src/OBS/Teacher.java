package OBS;

public class Teacher {
    String name;
    String phoneNumber;
    String branch;

    Teacher(String name, String phoneNumber, String branch){
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.branch = branch;
    }
    void print(){
        System.out.println("Adı : "+this.name);
        System.out.println("Telefonu : "+this.phoneNumber);
        System.out.println("Bölümü : "+this.branch);
    }
}

