package xzj.Thread.sync;

/**
 * @Author: XuZhiJun
 * @Description:
 * @Date: Created in 14:18 2019/5/8
 */
public class PairManipulator implements Runnable {
    PairManager pm;

    public PairManipulator(PairManager pm) {
        this.pm = pm;
    }


    @Override
    public void run() {
        while (true) {
            pm.increment();
        }
    }

    @Override
    public String toString() {

        return "Pair :" +pm.getPair()+" checkCounter = "+pm.checkCounter.get();
    }
}
