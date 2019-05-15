package xzj.adapter;

/**
 * @Author: XuZhiJun
 * @Description:
 * @Date: Created in 16:43 2019/5/15
 */
public interface SDCard {
    //读取SD卡方法
    String readSD();
    //写入SD卡功能
    int writeSD(String msg);
}
