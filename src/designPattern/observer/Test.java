package designPattern.observer;

import designPattern.observer.base.Observer;

/**
 * @Author: XuZhiJun
 * @Description:
 * @Date: Created in 17:16 2019/5/7
 */
public class Test {
    public static void main(String[] args) {
        Server server = new Server();
        Observer user1 = new User();
        Observer user2 = new User();
        Observer user3 = new User();
        server.registerObserver(user1);
        server.registerObserver(user2);
        server.registerObserver(user3);

        server.changeData("服务器信息改变了");
    }
}
