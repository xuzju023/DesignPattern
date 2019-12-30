package designPattern.adapter;

/**
 * @Author: XuZhiJun
 * @Description:
 * @Date: Created in 16:53 2019/5/15
 */
public class Test {
    public static void main(String[] args) {
        ThinkpadComputer thinkpadComputer = new ThinkpadComputer();

        System.out.println(thinkpadComputer.readSD(new TFCardAdapter(new TFCardImpl())));
        System.out.println(thinkpadComputer.readSD(new SDCardImpl()));
    }
}
