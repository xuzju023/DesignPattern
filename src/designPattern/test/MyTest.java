package designPattern.test;

import designPattern.decorator.FestivalDiscountDecorator;
import designPattern.decorator.VIPDiscountBusiness;

public class MyTest {
	public static void main(String[] args) throws Exception {
		FestivalDiscountDecorator bean = new FestivalDiscountDecorator(new VIPDiscountBusiness());
		bean.discountForFestival();
	}
}
