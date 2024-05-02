package OBS;
public class Main {
    public static void main(String[]Args){

        Course mat = new Course("Matematik", "MAT101", "MAT");
        Course fizik = new Course("Fizik", "FZK101", "FZK");
        Course kimya = new Course("Kimya", "KMY101", "KMY");

        Teacher t1 = new Teacher("Serdar Yil", "90550000000", "MAT");
        Teacher t2 = new Teacher("Ozlem Isik", "90550000001", "FZK");
        Teacher t3 = new Teacher("Huseyin Kirmizitas", "90550000002", "KMY");

        mat.addTeacher(t1);
        fizik.addTeacher(t2);
        kimya.addTeacher(t3);

        Student s1 = new Student("Nese ilhan", 4, "140144015", mat, fizik, kimya);
        s1.addBulkExamNote(50,20,40);
        s1.isPass();
        Student s2 = new Student("Esra Duran", 4, "2211133", mat, fizik, kimya);
        s2.addBulkExamNote(100,50,40);
        s2.isPass();

        Student s3 = new Student("Sukran corduk", 4, "221121312", mat, fizik, kimya);
        s3.addBulkExamNote(50,20,40);
        s3.isPass();

    }
}
