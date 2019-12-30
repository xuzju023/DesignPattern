package designPattern.decorator;

public class VIPDiscountDecorator extends DiscountDecorator{

    public VIPDiscountDecorator(BaseDiscount component) {
        super(component);
    }

    @Override
    public void discount() {
        component.discount();
    }

    @Override
    public void discountForVip() {
        component.discount();
        //do something
        System.out.println("扩展Vip用户折扣业务功能");
    }

    @Override
    public void discountForFestival() {
        //do nothing
    }
}
