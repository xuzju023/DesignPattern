package xzj.proxy.jdkproxy;

/**
 * @Author: XuZhiJun
 * @Description:
 * @Date: Created in 10:31 2019/2/1
 */
public class BookFacadeImpl implements BookFacade {
    @Override
    public void addBook(String msg) {
        System.out.println(msg);
    }

	@Override
	public void addBook2(String msg) {
		System.out.println(msg);
	}

}