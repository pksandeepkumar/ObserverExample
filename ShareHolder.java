
import java.util.Observable;
import java.util.Observer;


public class ShareHolder implements Observer {

    private StockMarket stockMarket = null;

    public String name;

    public ShareHolder(String name) {

        this.name = name;
    }

    public void addObserver( StockMarket stockMarket) {

        this.stockMarket = stockMarket;

        //make this object as an observer
        this.stockMarket.addObserver(this);
    }

    @Override
    public void update(Observable observable, Object data) {

        if(this.stockMarket != null) {

            System.out.println( name  + " got update from share markett!!!");

            System.out.println("Share Value of " + StockMarket.SHARE_NAME + ":" + stockMarket.getShareValue());
        }

    }
}
