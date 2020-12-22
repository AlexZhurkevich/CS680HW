package edu.umb.cs680.hw13;

import java.util.Observable;

public class DJIAQuoteObservable extends Observable{
    
    private float quote;
    
    public void changeQuote(float quote){
        this.quote = quote;
        setChanged();
        notifyObservers(new Float(quote));
    }

    public float getQuote(){
        return this.quote;
    }
}
