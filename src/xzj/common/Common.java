package xzj.common;

public class Common {
	public static void main(String[] args) {
		String url = encode(null);
		System.out.println(url);
	}
	public static String encode(String url) {
		assert url!=null:"字符串为空";
		return url;
	}
}
