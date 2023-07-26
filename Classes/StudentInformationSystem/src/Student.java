public class Student {
    Course c1;
    Course c2;
    Course c3;

    String name;
    String stuNo;
    String classes;
    double average;
    boolean isPass;

    Student(String name, String stuNo, String classes, Course c1, Course c2, Course c3) {
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.average = 0.0;
        this.isPass = false;

    }

    void addBulkExamNote(int note1, int note2, int note3) {
        if (note1 >= 0 && note1 <= 100) {
            this.c1.note = note1;
        }
        if (note2 >= 0 && note2 <= 100) {
            this.c2.note = note2;
        }
        if (note3 >= 0 && note3 <= 100) {
            this.c3.note = note3;
        }
    }

    void addBulkQuizNote(int quiz1, int quiz2, int quiz3) {
        if (quiz1 >= 0 && quiz1 <= 100) {
            this.c1.quiz = quiz1;
        }
        if (quiz2 >= 0 && quiz2 <= 100) {
            this.c2.quiz = quiz2;
        }
        if (quiz3 >= 0 && quiz3 <= 100) {
            this.c3.quiz = quiz3;
        }
    }

    void printNote() {
        System.out.println(c1.name + " ders notu: " + this.c1.note);
        System.out.println(c2.name + " ders notu: " + this.c2.note);
        System.out.println(c3.name + " ders notu: " + this.c3.note);
    }

    void printQuiz() {
        System.out.println(c1.name + " quiz notu: " + this.c1.quiz);
        System.out.println(c2.name + " quiz notu: " + this.c2.quiz);
        System.out.println(c3.name + " quiz notu: " + this.c3.quiz);
    }

    public void isPass() {

        this.c1.finalNote = (c1.note * (1 - c1.quizPercentage)) + c1.quiz * c1.quizPercentage;
        this.c2.finalNote = (c2.note * (1 - c2.quizPercentage)) + c2.quiz * c2.quizPercentage;
        this.c3.finalNote = (c3.note * (1 - c3.quizPercentage)) + c3.quiz * c3.quizPercentage;
        this.average = (c1.finalNote + c2.finalNote + c3.finalNote) / 3.0;
        if (average > 50) System.out.println("Passed.");
        else System.out.println("Do not pass.");
    }

    void printfinalNote() {
        System.out.println(c1.name + " final notu: " + this.c1.finalNote);
        System.out.println(c2.name + " final notu: " + this.c2.finalNote);
        System.out.println(c3.name + " final notu: " + this.c3.finalNote);
    }
}
