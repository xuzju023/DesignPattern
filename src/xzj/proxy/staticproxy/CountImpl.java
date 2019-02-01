package xzj.proxy.staticproxy;

/**
 * @Author: XuZhiJun
 * @Description:
 * @Date: Created in 10:28 2019/2/1
 */
public class CountImpl implements Count  {
    @Override
    public void queryCount() {
        System.out.println("查看账户...");

    }

    @Override
    public void updateCount() {
        System.out.println("修改账户...");

    }
}
