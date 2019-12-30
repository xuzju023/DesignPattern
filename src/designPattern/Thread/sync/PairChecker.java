package designPattern.Thread.sync;

/**
 * @Author: XuZhiJun
 * @Description:
 * @Date: Created in 14:23 2019/5/8
 */
public class PairChecker implements Runnable {
    PairManager pm;

    public PairChecker(PairManager pm) {
        this.pm = pm;
    }

    @Override
    public void run() {
        while(true){
            pm.checkCounter.incrementAndGet();
            pm.getPair().checkState();
        }
    }
}
