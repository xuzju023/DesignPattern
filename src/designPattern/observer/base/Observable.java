package designPattern.observer.base;


import java.util.ArrayList;
import java.util.List;

/**
 * @Author: XuZhiJun
 * @Description: 被观察者接口
 * @Date: Created in 16:57 2019/5/7
 */
public class Observable {
    List<Observer> observers;

    public void registerObserver(Observer o) {
        if (observers == null) {
            observers = new ArrayList<>();
        }
        observers.add(o);
    }

    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    public void notifyObserver(Object msg) {
        for (Observer observer : observers) {
            observer.update(this, msg);
        }
    }
}
