package xzj.adapter;

/**
 * @Author: XuZhiJun
 * @Description:
 * @Date: Created in 16:50 2019/5/15
 */
public interface TFCard {
    String readTF();
    int writeTF(String msg);
}
