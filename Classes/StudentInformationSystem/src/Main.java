public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Mahmut Hoca", "0555", "TRH");
        Teacher t2 = new Teacher("Özkan", "0554", "FZK");
        Teacher t3 = new Teacher("GrahamBell", "0000", "BIO");

        Course tarih = new Course("tarih", "101", "TRH", 0.2);

        Course fizik = new Course("fizik", "102", "FZK", 0.3);

        Course biyo = new Course("biyo", "103", "BIO", 0.4);

        Student s1 = new Student("İnek Şaban", "555", "4", tarih, fizik, biyo);
        s1.addBulkExamNote(90,80, 70);
        s1.addBulkQuizNote(95, 85, 75);

        s1.isPass();

        s1.printNote();
        s1.printQuiz();
        s1.printfinalNote();

    }
}