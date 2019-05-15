package xzj.adapter;

/**
 * @Author: XuZhiJun
 * @Description:
 * @Date: Created in 16:44 2019/5/15
 */
public class SDCardImpl implements SDCard {
    @Override
    public String readSD() {
        String msg = "读取SD卡";
        return msg;
    }
    @Override
    public int writeSD(String msg) {
        System.out.println("sd card write msg : " + msg);
        return 1;
    }
}
