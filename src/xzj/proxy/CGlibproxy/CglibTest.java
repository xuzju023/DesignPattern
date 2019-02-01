package xzj.proxy.CGlibproxy;

import sun.applet.Main;

/**
 * @Author: XuZhiJun
 * @Description:
 * @Date: Created in 10:44 2019/2/1
 */
public class CglibTest {
    public static void main(String[] args) {
        BookFacadeImpl bookFacade=new BookFacadeImpl();
        BookFacadeCglib  cglib=new BookFacadeCglib();
        BookFacadeImpl bookCglib=(BookFacadeImpl)cglib.getInstance(bookFacade);
        bookCglib.addBook();
    }

}
