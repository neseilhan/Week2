package SalarywithClasses;

public class Employee {
    String name;
    double salary ;
    int workHours;
    int hireYear;

 Employee(String name, int salary, int workHours, int hireYear){
    this.name = name;
    this.workHours = workHours;
    this.hireYear = hireYear;

     if(salary > 0 ){
         this.salary = salary;
     }else{
         System.out.println("Gecerli bir maas girmediniz.");
     }
 }
    boolean isSalaryCorrect(){
        return !(this.salary <= 0);
    }

    public double tax() {
        if (salary >= 1000) {
            final double TAX = 0.03;
            double taxRate = salary*TAX;
            salary -= taxRate;
            return taxRate;
        }
        else{
            return 0;
        }
    }

    public double bonus(){
      if(workHours>40){
          int perHoursBonus = (workHours-40) *30;
          return perHoursBonus;
      }
      else{
          return 0;
      }
    }

    public double bonusBasedOnHireYear(){
     int recentYear = 2021;
     double raiseRate;
     if(recentYear-hireYear < 10){
        raiseRate = salary*0.05;
        return raiseRate;

     } else if (recentYear - hireYear >= 9 && recentYear - hireYear < 20 ) {
         raiseRate =  salary*0.10;
         return raiseRate;

     } else if (recentYear - hireYear > 19) {
         raiseRate = salary*0.15;
         return raiseRate;
     }
     else {
         return 0;
     }
    }

    public void raiseSalary(){
     salary += bonus()+bonusBasedOnHireYear();
    }

    public String toString() { //toString() methodu String deger almali.

        return "Adi : " + name + "\n"+
                "Maasi : " + salary +"\n"+
                "Calisma saati " + workHours +"\n"+
                "Baslangic Yili : " + hireYear +"\n"+
                "Maasina göre vergi : " + tax() +"\n"+
                "Bonus odeme : " + bonus() +"\n"+
                "Calisma yilina göre maas bonusu : " + bonusBasedOnHireYear() +"\n"+
                "Vergi ve bonuslar ile birlikte total maas : " + salary;
    }

}
