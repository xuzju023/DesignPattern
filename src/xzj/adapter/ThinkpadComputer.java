package xzj.adapter;

/**
 * @Author: XuZhiJun
 * @Description: thinkpad读取各种类型的SD卡
 * @Date: Created in 16:45 2019/5/15
 */
public class ThinkpadComputer implements  Computer {
    @Override
    public String readSD(SDCard sdCard) {
        if(sdCard == null){
            throw new NullPointerException("sd card null");
        }
        return sdCard.readSD();
    }
}
