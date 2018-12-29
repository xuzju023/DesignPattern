package xzj.callback;

public  class Father {
	int c;
	public String a;
	public String b;
	public  void before() {};
	public Father() {
		System.out.println("-----------");
		a="a";
		b="b";
	}
	public void doCreateBean() {
		before();
		System.out.println("已被创建");
	}
	
}
