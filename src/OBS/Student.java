package OBS;

public class Student {
    String name,studentNo;
    int classes;
    Course mat;
    Course fizik;
    Course kimya;
    double average;
    double performanceAverage;
    boolean isPass;

    Student(String name,int classes, String studentNo,Course mat, Course fizik, Course kimya){
        this.name = name;
        this.classes = classes;
        this.studentNo = studentNo;
        this.mat = mat;
        this.fizik = fizik;
        this.kimya = kimya;
        calcAverage();
        this.isPass = false;
    }
    public void addBulkGrades(int mat, int fizik, int kimya, int matPerf, int fizPerf, int kimPerf ){
        if(mat >= 0 && mat <= 100){
            this.mat.note = mat;
        }
        if(fizik >= 0 && fizik <= 100){
            this.fizik.note = fizik;
        }

        if (kimya >= 0 && kimya <= 100) {
            this.kimya.note = kimya;
        }
        if(matPerf >= 0 && matPerf <= 100){
            this.mat.performance = matPerf;
        }
        if(fizPerf >= 0 && fizPerf <= 100){
            this.fizik.performance = fizPerf;
        }

        if (kimPerf >= 0 && kimPerf <= 100) {
            this.kimya.performance = kimPerf;
        }
    }

    public void isPass(){
        if(this.mat.note == 0 || this.fizik.note == 0 || this.kimya.note == 0 ){
            System.out.println("Sınav notlari tam olarak girilmemis.");
        } else if (this.mat.performance == 0 || this.fizik.performance == 0 || this.kimya.performance == 0)
        {
            System.out.println("Performans notlari tam olarak girilmemis.");
        } else{
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Ortalama : "+this.average);
            if(this.isPass){
                System.out.println("Sinifi gecti.");
            }
            else{
                System.out.println("Sinifta kaldi.");
            }
        }
    }
    public void calcAverage(){
        this.performanceAverage = (this.fizik.performance + this.mat.performance + this.kimya.performance)*0.20 / 3;
        this.average = ((this.fizik.note + this.kimya.note + this.mat.note)*0.80)/3  + performanceAverage;
    }
    public boolean isCheckPass(){
        calcAverage();
        return this.average > 55;
    }
    public  void printNote(){
        System.out.println("=========================");
        System.out.println("Ogrenci : " + this.name);
        System.out.println("Matematik Notu : " + this.mat.note);
        System.out.println("Fizik Notu : " + this.fizik.note);
        System.out.println("Kimya Notu : " + this.kimya.note);
        System.out.println("Matematik sozlu Notu : " + this.mat.performance);
        System.out.println("Fizik sozlu Notu : " + this.fizik.performance);
        System.out.println("Kimya sozlu Notu : " + this.kimya.performance);
    }
}
