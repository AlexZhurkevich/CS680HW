package edu.umb.cs680.hw06;


public class DrawerOpen implements State {
	
    private DrawerOpen() {}
    private static DrawerOpen instance = null;
    
    public static DrawerOpen getInstance() {
        if (instance == null)
            instance = new DrawerOpen();
        return instance;
    }
    
    public void openClosedButtonPushed() {
        DVDPlayer player = DVDPlayer.getInstance();
        player.close();
        player.changeState(DrawerClosedNotPlaying.getInstance());
    }
    
    public void playButtonPushed() {
        DVDPlayer player = DVDPlayer.getInstance();
        player.close();
        player.play();
        player.changeState(DrawerClosedPlaying.getInstance());
    };
    
    public void stopButtonPushed() {
        // do nothing 
    };
}
