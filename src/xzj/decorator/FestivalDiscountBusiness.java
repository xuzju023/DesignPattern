package xzj.decorator;

public class FestivalDiscountBusiness implements BaseDiscount {
	@Override
	public void discount() {
		System.out.println("处理节假日折扣业务");
	}
}