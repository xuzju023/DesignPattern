package xzj.singleton;

public class Elvis {
	private static final Elvis INSTANCE= new Elvis();
	private Elvis() {}
	public static Elvis getInstance() {
		System.out.println("---解决-"); 
		return INSTANCE;
	}
	public static void main(String[] args) {
		for (int i = 0; i <100 ; i++) {
			System.out.println(getInstance()); 
		}
	}
}
