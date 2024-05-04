package SalarywithClasses;

public class Main{
    public static void main(String[]Args){
        Employee e1 = new Employee("Nese ilhan", 0, 41, 2000); //class'a ait degiskenleri gir.

        if(e1.isSalaryCorrect()){ //Maas girdisi dogruysa Employee classındaki toString() methodunu cagirarak bilgileri yazdir.
            System.out.println(e1.toString());
        }
    }
}
