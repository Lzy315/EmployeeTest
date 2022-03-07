package day13;

public class Bootstrap {
    public static void main(String[] args) {
        MyRed myRed = new MyRed("土豪的红包");
        myRed.setOwnerName("王思聪");

        //普通红包
//        OpenMode normalmode = new NormalMode();
//        myRed.setOpenWay(normalmode);

        //手气红包
        OpenMode random = new RandomMode();
        myRed.setOpenWay(random);


    }
}
