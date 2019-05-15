package xzj.adapter;

/**
 * @Author: XuZhiJun
 * @Description:
 * @Date: Created in 16:51 2019/5/15
 */
public class TFCardAdapter implements SDCard {
    private TFCard tfCard;

    public TFCardAdapter(TFCard tfCard) {
        this.tfCard = tfCard;
    }

    @Override
    public String readSD() {
        return tfCard.readTF();
    }

    @Override
    public int writeSD(String msg) {
        return tfCard.writeTF(msg);
    }
}
