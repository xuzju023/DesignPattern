package xzj.callback;

public class Son extends Father{
	public Son() {
		//System.out.println(super.a);
	}
	
	@Override
	public void before() {
		System.out.println("------before-----");
	}
	@Override
	public void doCreateBean() {
		super.doCreateBean();
	}
}
