package designPattern.test;

public abstract class AbstractFacktory {
	public String getBean() {
		return createBean();
	}
	abstract String createBean();
}
