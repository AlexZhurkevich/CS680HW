package edu.umb.cs680.hw06;

import java.lang.System.*;

public class DVDPlayer {
	
    private DVDPlayer() {}
	
    private static DVDPlayer player = null;
    public State state = DrawerClosedNotPlaying.getInstance();
    
    public static DVDPlayer getInstance() {
        if (player == null)
            player = new DVDPlayer();
        return player;
    }
    
    public void changeState(State state) {
        this.player.state = state;
    }
    
    public State getState(){
        return this.state;
    }
    
    public void close() {
        System.out.println("<<Closing>>");
    }

    public void open() {
        System.out.println("<<Open>>");
    }
    
    public void stop() {
        System.out.println("<<Stop>>");
    }
    
    public void play() {
        System.out.println("<<Playing>>");
    }
    
    public void openClosedButtonPushed() {
        this.state.openClosedButtonPushed();
    }
    
    public void playButtonPushed() {
        this.state.playButtonPushed();
    }
    
    public void stopButtonPushed() {
        this.state.stopButtonPushed();
    }
    
}
