package xzj.Thread.sync;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Author: XuZhiJun
 * @Description:
 * @Date: Created in 14:14 2019/5/8
 */
public class PairManager1 extends PairManager {
    private Lock lock = new ReentrantLock();

    @Override
    public synchronized void increment() {
        p.incrementX();
        p.incrementY();
        store(getPair());

    }
}
