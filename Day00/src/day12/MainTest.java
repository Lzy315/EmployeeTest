package day12;

public class MainTest {
    public static void main(String[] args) {
        Computer computer = new Computer();

        computer.powerOn();
//        Mouse mouse = new Mouse();
        USB mouse = new Mouse();  //向上转型
        computer.usbDevice(mouse);

        KeyBoard keyBoard = new KeyBoard();
        computer.usbDevice(keyBoard);
//        computer.usbDevice(new KeyBoard());  //使用匿名对象，也是向上转型

        computer.powerOff();
    }
}
