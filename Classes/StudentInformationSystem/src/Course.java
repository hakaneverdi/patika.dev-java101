public class Course {
    Teacher teacher;
    String name;
    String code;
    String prefix;
    int note;

    int quiz;
    double quizPercentage;

    double finalNote;



    //Constructor
    Course(String name, String code, String prefix, double quizPercentage) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.note = 0;
        this.quizPercentage = quizPercentage;
        this.quiz = 0;
        this.finalNote = 0.0;

    }

    void addTeacher(Teacher teacher) {
        if (teacher.branch.equals(this.prefix)) {
            this.teacher = teacher;
            printTeacherInfo();
        } else {
            System.out.println("Does not match!");
        }
    }

    void printTeacherInfo() {
        this.teacher.print();
    }
}