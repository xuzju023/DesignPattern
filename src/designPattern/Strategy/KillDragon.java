package designPattern.Strategy;

/**
 * @Author: XuZhiJun
 * @Description:
 * @Date: Created in 15:58 2019/5/7
 */
public class KillDragon {
    private KillStrategy strategy;

    public KillDragon(KillStrategy strategy) {
        this.strategy = strategy;
    }
    protected void ChangeStrategy(KillStrategy strategy) {
        this.strategy = strategy;
    }

    public void execute() {
        strategy.execute();
    }
}
