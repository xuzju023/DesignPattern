package designPattern.proxy.jdkproxy;

public class TestJdkproxy {
	public static void main(String[] args) {
		BookFacadeProxy proxyFactory = new BookFacadeProxy();
		BookFacade target = new BookFacadeImpl();
		BookFacade proxy = (BookFacade)proxyFactory.bind(target);
		proxy.addBook2("呵呵呵呵");
	}
}
