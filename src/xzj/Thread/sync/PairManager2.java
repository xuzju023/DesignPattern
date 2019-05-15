package xzj.Thread.sync;

/**
 * @Author: XuZhiJun
 * @Description:
 * @Date: Created in 14:14 2019/5/8
 */
public class PairManager2 extends PairManager {
    @Override
    public void increment() {
        Pair temp;
        synchronized (this) {
            p.incrementX();
            p.incrementY();
            temp = getPair();
        }
        store(temp);
    }
}
