package day05.demo;
import day05.demo.Phone;
public class demoPhoneOne {
    public static void main(String[] args) {
        Phone mi6 = new Phone();
        mi6.brand = "xiaomi";
        mi6.colour = "black";
        mi6.price = 2499.0;

        mi6.call("Xuqin");
        mi6.sendMessage();

        System.out.println("手机品牌是：" + mi6.brand);
        System.out.println("手机颜色是：" + mi6.colour);
        System.out.println("手机价格是：" + mi6.price);
    }
}
