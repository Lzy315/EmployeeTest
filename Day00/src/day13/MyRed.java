package day13;

public class MyRed extends RedPacketFrame {
    public MyRed(String title) {
        super(title);
    }

    @Override
    public void setOwnerName(String ownerName) {
        super.setOwnerName(ownerName);
    }

    @Override
    public void setOpenWay(OpenMode openWay) {
        super.setOpenWay(openWay);
    }
}
