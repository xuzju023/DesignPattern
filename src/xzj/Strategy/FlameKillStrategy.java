package xzj.Strategy;

/**
 * @Author: XuZhiJun
 * @Description:
 * @Date: Created in 16:00 2019/5/7
 */
public class FlameKillStrategy implements KillStrategy {
    @Override
    public void execute() {
        System.out.println("火遁：豪火灭却！~~~");
    }
}
