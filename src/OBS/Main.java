package OBS;
public class Main {
    public static void main(String[]Args){

        Course mat = new Course("Matematik", "MAT101", "MAT");
        Course fizik = new Course("Fizik", "FZK101", "FZK");
        Course kimya = new Course("Kimya", "KMY101", "KMY");
        Course sozluMat = new Course("Matematik Sozlu", "MAT101", "MATSOZ");
        Course sozluFiz = new Course("Fizik Sozlu", "FZK101", "FZKSOZ");
        Course sozluKim = new Course("Kimya Sozlu", "KMY101", "KMYSOZ");

        Teacher t1 = new Teacher("Serdar Yil", "90550000000", "MAT");
        Teacher t2 = new Teacher("Ozlem Isik", "90550000001", "FZK");
        Teacher t3 = new Teacher("Huseyin Kirmizitas", "90550000002", "KMY");

        mat.addTeacher(t1);
        fizik.addTeacher(t2);
        kimya.addTeacher(t3);

        Student s1 = new Student("Nese ilhan", 4, "140144015", mat, fizik, kimya, sozluFiz, sozluKim, sozluMat);
        s1.addBulkExamNote(50,20,40, 60,80,0);
        s1.isPass();
        Student s2 = new Student("Esra Duran", 4, "2211133", mat, fizik, kimya, sozluFiz, sozluKim, sozluMat);
        s2.addBulkExamNote(100,50,40,55,85,90);
        s2.isPass();

        Student s3 = new Student("Sukran corduk", 4, "221121312", mat, fizik, kimya,sozluFiz, sozluKim, sozluMat);
        s3.addBulkExamNote(50,20,40,85,75,100);
        s3.isPass();

    }
}
