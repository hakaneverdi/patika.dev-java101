// extending by Product class
// it inherits variables and methods of Product class
class Phone extends Product {

    String phoneNumber;

    // constructor
    public Phone(int id, String name, double price, String phoneNumber) {
        super(id, name, price); // inheritance by Product class
        this.phoneNumber = phoneNumber; // creates a new Phone object
    }
}
