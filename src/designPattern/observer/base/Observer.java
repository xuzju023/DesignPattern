package designPattern.observer.base;

/**
 * @Author: XuZhiJun
 * @Description: 观察者接口
 * @Date: Created in 16:58 2019/5/7
 */
public interface Observer {
    void update(Observable o, Object arg);
}
