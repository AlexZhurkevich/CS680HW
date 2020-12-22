package edu.umb.cs680.hw13;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;
import java.lang.*;
	
class MulticastTest {
    private static StockQuoteMulticast sqm = new StockQuoteMulticast();
    private static DJIAQuoteMulticast djiam = new DJIAQuoteMulticast();
    private static PieChartMulticast pieChart = new PieChartMulticast();
    private static TableMulticast table = new TableMulticast();
    private static ThreeDMulticast three = new ThreeDMulticast();

    @BeforeAll
    private static void initi(){
        djiam.addObserver(pieChart);
        sqm.addObserver(pieChart);
        sqm.addObserver(three);
        sqm.addObserver(table);
        djiam.addObserver(pieChart);
        djiam.addObserver(three);
        djiam.addObserver(table);
    }

    @Test
	public void instanceTest() {
		assertTrue(sqm instanceof StockQuoteMulticast);
        assertTrue(djiam instanceof DJIAQuoteMulticast);
        assertTrue(pieChart instanceof PieChartMulticast);
        assertTrue(table instanceof TableMulticast);
        assertTrue(three instanceof ThreeDMulticast);
	}

    @Test
    public void stTest(){
        Float test = 150.39F;
        sqm.changeQuote("Google", 542.00F);
        sqm.changeQuote("Google", test);
        String expected = String.valueOf(test);
        String actual = sqm.getMap().get("Google").toString();
        assertEquals(expected, actual);
    }

    @Test
    public void djiaTest(){
        Float test = 249.39F;
        djiam.changeQuote(249.39F);
        djiam.changeQuote(test);
        String actual = String.valueOf(djiam.getQuote());
        String expected = String.valueOf(test);
        assertEquals(expected, actual);
    }
}