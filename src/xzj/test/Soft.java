package xzj.test;

/**
 * @Author: XuZhiJun
 * @Description:
 * @Date: Created in 11:27 2019/4/1
 */
public class Soft implements Strategy {
    public String approach(String msg) {
        return msg.toLowerCase() + "?";
    }
}
