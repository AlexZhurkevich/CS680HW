package edu.umb.cs680.hw06;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.lang.*;


public class DrawerClosedNotPlayingTest{
    
    @Test
    public void playButtonPushed_when_DrawerClosedNotPlaying() {
        DrawerClosedPlaying instance = DrawerClosedPlaying.getInstance();
        DVDPlayer player = DVDPlayer.getInstance();
        player.playButtonPushed();
        assertThat(instance, is(player.state));
    }
    
    @Test
    public void stopButtonPushed_when_DrawerClosedNotPlaying() {
    	DrawerClosedNotPlaying instance =  DrawerClosedNotPlaying.getInstance();
        DVDPlayer player = DVDPlayer.getInstance();
        player.changeState(instance);
        instance.stopButtonPushed();
        State actual = player.getState();
        State expect = DrawerClosedNotPlaying.getInstance();
        assertEquals(actual,expect);
    }

    @Test
    public void openCloseButtonPushed_when_DrawerClosedNotPlaying() {
    	DrawerClosedNotPlaying instance =  DrawerClosedNotPlaying.getInstance();
        DVDPlayer player = DVDPlayer.getInstance();
        player.changeState(instance);
        instance.openClosedButtonPushed();
        State actual = player.getState();
        State expect = DrawerOpen.getInstance();
        assertEquals(actual,expect);
    }
    
}
	
	
	
	
	
	
	
	
	
	
	
	

