package designPattern.decorator;

public class FestivalDiscountDecorator extends DiscountDecorator{

    public FestivalDiscountDecorator(BaseDiscount component) {
        super(component);
    }

    @Override
    public void discount() {
        component.discount();
    }

    @Override
    public void discountForVip() {
        //do noting
    }

    @Override
    public void discountForFestival() {
        discount();
        //do something
        System.out.println("扩展节假日折扣业务功能");
    }
}
