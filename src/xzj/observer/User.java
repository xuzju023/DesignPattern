package xzj.observer;

import xzj.observer.base.Observer;
import xzj.observer.base.Observable;

/**
 * @Author: XuZhiJun
 * @Description:
 * @Date: Created in 16:59 2019/5/7
 */
public class User implements Observer {

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof Server) {
            System.out.println(arg.toString());
        }
    }
}
