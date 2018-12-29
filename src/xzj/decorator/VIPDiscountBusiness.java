package xzj.decorator;

public class VIPDiscountBusiness extends BaseDiscount {
    @Override
    public void discount() {
        System.out.println("处理vip用户的折扣业务");
    }
}
