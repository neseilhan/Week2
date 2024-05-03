package OBS;

public class Student {
    String name,studentNo;
    int classes;
    Course mat;
    Course fizik;
    Course kimya;
    Course sozluFiz;
    Course sozluMat;
    Course sozluKim;
    double average;
    boolean isPass;

    Student(String name,int classes, String studentNo,Course mat, Course fizik, Course kimya, Course sozluFiz, Course sozluMat, Course sozluKim){
        this.name = name;
        this.classes = classes;
        this.studentNo = studentNo;
        this.mat = mat;
        this.fizik = fizik;
        this.kimya = kimya;
        this.sozluFiz = sozluFiz;
        this.sozluMat = sozluMat;
        this.sozluKim = sozluKim;
        calcAverage();
        this.isPass = false;
    }
    public void addBulkExamNote(int mat, int fizik, int kimya, int sozluFiz, int sozluKim, int sozluMat ){
        if(mat >= 0 && mat <= 100){
            this.mat.note = mat;
        }
        if(fizik >= 0 && fizik <= 100){
            this.fizik.note = fizik;
        }

        if (kimya >= 0 && kimya <= 100) {
            this.kimya.note = kimya;
        }
        if(sozluFiz >= 0 && sozluFiz <= 100){
            this.sozluFiz.note = sozluFiz;
        }
        if(sozluMat >= 0 && sozluMat <= 100){
            this.sozluMat.note = sozluMat;
        }

        if (sozluKim >= 0 && sozluKim <= 100) {
            this.sozluKim.note = sozluKim;
        }
    }

    public void isPass(){
        if(this.mat.note == 0 || this.fizik.note == 0 || this.kimya.note == 0 ||this.sozluMat.note == 0 || this.sozluFiz.note == 0 || this.sozluKim.note == 0){
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
    public void calcAverage(){
        this.average = (((this.fizik.note*0.80)+(this.sozluFiz.note*0.20))+ ((this.kimya.note*0.80)+(this.sozluKim.note*0.20)) + ((this.mat.note*0.80)+(this.sozluMat.note*0.20))) / 3;
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
        System.out.println("Matematik sozlu Notu : " + this.sozluMat.note);
        System.out.println("Fizik sozlu Notu : " + this.sozluFiz.note);
        System.out.println("Kimya sozlu Notu : " + this.sozluKim.note);
    }
}
