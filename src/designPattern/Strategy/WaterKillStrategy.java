package designPattern.Strategy;

/**
 * @Author: XuZhiJun
 * @Description:
 * @Date: Created in 16:03 2019/5/7
 */
public class WaterKillStrategy implements KillStrategy {
    @Override
    public void execute() {
        System.out.println("水遁：水龙弹！");
    }
}
