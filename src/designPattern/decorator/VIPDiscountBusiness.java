package designPattern.decorator;

public class VIPDiscountBusiness implements BaseDiscount {
    @Override
    public void discount() {
        System.out.println("处理vip用户的折扣业务");
    }
}
