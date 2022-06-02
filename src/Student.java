import java.util.Scanner;

public class Student {
    Course c1;
    Course c2;
    Course c3;
    String name;
    String stuNo;
    String classes;
    double average;
    boolean isPass;
    Scanner input = new Scanner(System.in);

    Student(String name, String stuNo, String classes, Course c1,Course c2,Course c3){
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.c1=c1;
        this.c2=c2;
        this.c3=c3;
        this.average = 0;
        this.isPass = false;

    }

    void addBulkExamNote (int note1, int note2, int note3) {
        if(note1 >=0 && note1 <= 100 ) {
            this.c1.note = note1;
            System.out.print(this.c1.name +" sözlü notu giriniz : ");
            this.c1.sozlu = input.nextInt();
        }
        if(note2 >=0 && note2 <= 100 ) {
            c2.note = note2;
            System.out.print(this.c2.name +" sözlü notu giriniz : ");
            this.c2.sozlu = input.nextInt();
        }
        if(note3 >=0 && note3 <= 100 ) {
            c3.note = note3;
            System.out.print(this.c3.name +" sözlü notu giriniz : ");
            this.c3.sozlu = input.nextInt();
        }
    }

    void isPass() {
        System.out.println("------------------------------");
        this.average = ((this.c1.note*0.8+this.c1.sozlu*0.2) + (this.c2.note*0.8+this.c2.sozlu*0.2) + (this.c3.note*0.8+this.c3.sozlu*0.2)) /3.0;

        if(this.average >=60) {
            System.out.println("Geçtiniz.");
        } else {
            System.out.println("Kaldınız!");
        }
        printNote();
    }

    void printNote () {

        System.out.println(this.c1.name + "Notu\t : " + this.c1.note+ " Sözlü Notu = "+ this.c1.sozlu);
        System.out.println(this.c2.name + "Notu\t : " + this.c2.note+ " Sözlü Notu = "+ this.c2.sozlu);
        System.out.println(this.c3.name + "Notu : " + this.c3.note+ " Sözlü Notu = "+ this.c3.sozlu);
        System.out.println("Ortalamanız : " + this.average);
    }


}
