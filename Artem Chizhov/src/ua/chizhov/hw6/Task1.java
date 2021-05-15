package ua.chizhov.hw6;

public class Task1 {
    public static void main(String[] args) {
        Phone firstPhone = new Phone();
        Phone secondPhone = new Phone(26589, "Samsung A20", 0.420);
        Phone thirdPhone = new Phone(36985, "Iphone 12S");

        firstPhone.weight = 1.50;
        firstPhone.number = 25874;
        firstPhone.model = "Nokia 31.10";
        thirdPhone.weight = 0.380;

        System.out.println("Phone{ number = " + firstPhone.number);
        System.out.println("       weight = " + firstPhone.weight);
        System.out.println("       model  = " + firstPhone.model + "}");

        System.out.println(secondPhone.toString());
        System.out.println(thirdPhone.toString());

        firstPhone.receiveCall("Artem");
        System.out.println(firstPhone.getNumber());
        secondPhone.receiveCall("Artur");
        System.out.println(secondPhone.getNumber());
        thirdPhone.receiveCall("Ann");
        System.out.println(thirdPhone.getNumber());

    }

}
