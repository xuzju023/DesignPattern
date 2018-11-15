package xzj.singleton;

public class Elvis {
	private static final Elvis INSTANCE= new Elvis();
	private Elvis() {}
	public static Elvis getInstance() {
		System.out.println("----");
		return INSTANCE;
	}
	public static void main(String[] args) {
		System.out.println(getInstance());
	}
}
