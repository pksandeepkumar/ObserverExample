
public class ObserverExample {

    public static void main( String args[]) {
        //Create a stock market object
        StockMarket market = new StockMarket();

        //Create a share holder, his name is Iorn Man and would like
        // to observe stock market
        ShareHolder holderIornMan = new ShareHolder("Iorn Man");
        holderIornMan.addObserver(market);

        //Create another share holder, his name is Spiderman and would like
        // to observe stock market
        ShareHolder holderSpiderMan = new ShareHolder("Spiderman");
        holderSpiderMan.addObserver(market);

        //Create one more share holder, his name is Batman and would not
        // like to observe stock market
        ShareHolder holderBatMan = new ShareHolder("Batman");


        //Update share value, this will notify all observers of Stock Market
        market.setShareValue(1527.56f);
    }
}
