import java.util.Observable;


public class StockMarket extends Observable {

    public static final String SHARE_NAME = "INFY";

    private float sharValue = 0;

    public float getShareValue() {

        return sharValue;
    }


    public void setShareValue( float shareValue) {

        this.sharValue = shareValue;

        //Method of base class Observable, to set change
        setChanged();

        //Method of base class Observable, to notify all observers
        notifyObservers();
    }
}
