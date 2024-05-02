package OBS;

public class Student {
    String name,studentNo;
    int classes;
    Course mat;
    Course fizik;
    Course kimya;
    double average;
    boolean isPass;

    Student(String name,int classes, String studentNo,Course mat, Course fizik, Course kimya){
        this.name = name;
        this.classes = classes;
        this.studentNo = studentNo;
        this.mat = mat;
        this.fizik = fizik;
        this.kimya = kimya;
        calcAvarage();
        this.isPass = false;
    }
    public void addBulkExamNote(int mat, int fizik, int kimya){
        if(mat >= 0 && mat <= 100){
            this.mat.note = mat;
        }
        if(fizik >= 0 && fizik <= 100){
            this.fizik.note = fizik;
        }

        if (kimya >= 0 && kimya <= 100) {
            this.kimya.note = kimya;
        }
    }
    public void isPass(){
        if(this.mat.note == 0 || this.fizik.note == 0 || this.kimya.note == 0){
            System.out.println("Notlar tam olarak girilmemis.");
        }
        else{
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
    public void calcAvarage(){
        this.average = (this.fizik.note+ this.kimya.note + this.mat.note) / 3;
    }
    public boolean isCheckPass(){
        calcAvarage();
        return this.average > 55;
    }
    public  void printNote(){
        System.out.println("=========================");
        System.out.println("Ogrenci : " + this.name);
        System.out.println("Matematik Notu : " + this.mat.note);
        System.out.println("Fizik Notu : " + this.fizik.note);
        System.out.println("Kimya Notu : " + this.kimya.note);
    }
}
