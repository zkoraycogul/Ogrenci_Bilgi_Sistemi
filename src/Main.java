import java.util.concurrent.CountDownLatch;

public class Main {
    public static void main(String[] args) {

        Teacher t1 = new Teacher ("Mahmut Hoca", "TRH", "5551112233");
        Teacher t2 = new Teacher("Graham Bell", "FZK", "123123");
        Teacher t3 = new Teacher("Külyutmaz", "BIO", "321321");
        Course tarih = new Course("Tarih","101","TRH");
        tarih.addTeacher(t1);
        Course fizik = new Course("Fizik","102","FZK");
        fizik.addTeacher(t2);
        Course biyo = new Course("Biyoloji","101","BIO");
        biyo.addTeacher(t3);

        Student s1 = new Student("İnek Şaban","123","4", tarih,fizik , biyo);
        s1.addBulkExamNote(100,30,50);
        s1.isPass();

        Student s2 = new Student("Güdük Necmi","124","4",tarih,fizik,biyo);
        s2.addBulkExamNote(55,20,88);
        s2.isPass();

    }


}
