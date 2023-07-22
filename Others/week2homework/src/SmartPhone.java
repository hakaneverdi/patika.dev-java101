// extending by phone class
// it inherits variables and methods of Phone class
class SmartPhone extends Phone {
    int storage;
    int ram;
    int camera;

     // constructor
    public SmartPhone(int id, String name, double price, String phoneNumber, int storage, int ram, int camera) {
        super(id, name, price, phoneNumber); // inheritance by Phone class
        this.storage = storage; // creates a new Smartphone object
        this.ram = ram;         // creates a new Smartphone object
        this.camera = camera;   // creates a new Smartphone object
    }
}
