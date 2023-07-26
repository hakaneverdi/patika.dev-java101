public class Teacher {
    String name;
    String phoneNumber;
    String branch;

    //Constructor
    Teacher(String name, String phoneNumber, String branch) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.branch = branch;
    }

    void print() {
        System.out.println("Name: " + this.name);
        System.out.println("Phone Number: " + this.phoneNumber);
        System.out.println("Branch : " + this.branch);
    }
}
