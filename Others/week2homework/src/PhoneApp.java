public class PhoneApp {
    public static void main(String[] args) {
        SmartPhone[] smartPhones = new SmartPhone[5]; // new 5 SmartPhone object for PhoneApp class


        smartPhones[0] = new SmartPhone(1, "Phone 1", 111.11, "0111", 128, 1, 11);
        smartPhones[1] = new SmartPhone(2, "Phone 2", 222.22, "0222", 256, 3, 22);
        smartPhones[2] = new SmartPhone(3, "Phone 3", 333.33, "0333", 512, 5, 33);
        smartPhones[3] = new SmartPhone(4, "Phone 4", 444.44, "0444", 128, 7, 44);
        smartPhones[4] = new SmartPhone(5, "Phone 5", 555.55, "0555", 256, 8, 55);

        double totalPrice = calculateTotalPrice(smartPhones);
        System.out.println("Total Price of SmartPhones: ₺" + totalPrice);
    }

    // method for calculating price
    public static double calculateTotalPrice(SmartPhone[] smartPhoneArray) {
        double total = 0;
        for (SmartPhone smartPhone : smartPhoneArray) {
            total += smartPhone.price;
        }
        return total;
    }
}
