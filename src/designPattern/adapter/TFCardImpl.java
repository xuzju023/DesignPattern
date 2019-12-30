package designPattern.adapter;

/**
 * @Author: XuZhiJun
 * @Description:
 * @Date: Created in 16:50 2019/5/15
 */
public class TFCardImpl implements TFCard {

    @Override
    public String readTF() {
        String msg = "tf card reade msg : hello word tf card";
        return msg;
    }

    @Override
    public int writeTF(String msg) {
        System.out.println("tf card write a msg : " + msg);
        return 1;
    }
}