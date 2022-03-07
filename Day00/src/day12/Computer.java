package day12;

public class Computer {
    public void powerOn() {
        System.out.println("笔记本电脑开机");
    }

    public  void powerOff() {
        System.out.println("笔记本电脑关机");
    }

    public void usbDevice(USB usb) {

        usb.open();

        if (usb instanceof KeyBoard) {
            KeyBoard keyBoard = (KeyBoard) usb;  //向下转型为键盘
           keyBoard.type();
        } else if (usb instanceof Mouse) {
            Mouse mouse = (Mouse) usb;
            mouse.click();
        }
        usb.close();
    }

}
