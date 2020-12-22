package edu.umb.cs680.hw13;

public class ThreeDMulticast implements DJIAQuoteObserver, StockQuoteObserver {

    public void updateStock(StockEvent stockEvent) {
        System.out.println("Updating PieChartMulticast");
        System.out.println("Quote: " + stockEvent.getQuote());
    }

	public void updateDJIA(DJIAEvent event) {
		System.out.println("Updating PieChartMulticast");
		System.out.println("DJIA: " + event.getQuote());
	}
}