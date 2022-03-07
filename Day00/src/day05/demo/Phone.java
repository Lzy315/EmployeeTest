package day05.demo;

public class Phone {
    String brand;
    double price;
    String colour;

    public void call(String who) {
        System.out.println("给" + who +"打电话");
    }

    public void sendMessage() {
        System.out.println("send Message");
    }
}
