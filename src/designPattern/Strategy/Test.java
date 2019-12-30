package designPattern.Strategy;

/**
 * @Author: XuZhiJun
 * @Description:
 * @Date: Created in 16:03 2019/5/7
 */
public class Test {
    public static void main(String[] args) {
        KillDragon kill = new KillDragon(new FlameKillStrategy());
        kill.execute();
        kill.ChangeStrategy(new WaterKillStrategy());
        kill.execute();
    }
}
