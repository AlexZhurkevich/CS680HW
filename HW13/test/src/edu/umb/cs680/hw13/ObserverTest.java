package edu.umb.cs680.hw13;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;
import java.lang.*;

class ObserverTest {
    private static StockQuoteObservable sqm = new StockQuoteObservable();
    private static DJIAQuoteObservable djiam = new DJIAQuoteObservable();

    @Test
	public void instanceTest() {
		assertTrue(sqm instanceof StockQuoteObservable);
		assertTrue(djiam instanceof DJIAQuoteObservable);

	}

    @Test
    public void sqmTest(){
        Float test = 150.39F;
        sqm.changeQuote("Google", 542.00F);
        sqm.changeQuote("Google", test);
        String expected = String.valueOf(test);
        String actual = sqm.getMap().get("Google").toString();
        assertEquals(expected, actual);
    }

    @Test
    public void djiamTest(){
        Float test = 249.39F;
        djiam.changeQuote(249.39F);
        djiam.changeQuote(test);
        String actual = String.valueOf(djiam.getQuote());
        String expected = String.valueOf(test);
        assertEquals(expected, actual);
    }
}