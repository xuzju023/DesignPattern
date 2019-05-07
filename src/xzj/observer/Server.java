package xzj.observer;

import xzj.observer.base.Observable;

/**
 * @Author: XuZhiJun
 * @Description:
 * @Date: Created in 17:02 2019/5/7
 */
public class Server extends Observable {
    private String data;



    public void changeData(String data){
        this.data=data;
        notifyObserver(data);
    }
}
