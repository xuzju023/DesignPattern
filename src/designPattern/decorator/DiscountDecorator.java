package designPattern.decorator;

public abstract class DiscountDecorator implements BaseDiscount{

    public BaseDiscount component;

    public DiscountDecorator(BaseDiscount component) {
        this.component = component;
    }   
    public abstract void discountForVip();

    public abstract void discountForFestival();
}
