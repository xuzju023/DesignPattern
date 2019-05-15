package xzj.test;

import xzj.decorator.BaseDiscount;
import xzj.decorator.FestivalDiscountBusiness;
import xzj.decorator.FestivalDiscountDecorator;
import xzj.decorator.VIPDiscountBusiness;

public class MyTest {
	public static void main(String[] args) throws Exception {
		FestivalDiscountDecorator bean = new FestivalDiscountDecorator(new VIPDiscountBusiness());
		bean.discountForFestival();
	}
}
