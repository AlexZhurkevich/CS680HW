package edu.umb.cs680.hw06;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.lang.*;

public class DrawerClosedPlayingTest{
    
    @Test
    public void openCloseButtonPushed_when_DrawerClosedPlaying() {
        
        DrawerOpen instance = DrawerOpen.getInstance();
        DVDPlayer player = DVDPlayer.getInstance();
        player.playButtonPushed();
        player.openClosedButtonPushed();
        assertThat(instance, is(player.state));
    }
    
   @Test
    public void playButtonPushed_when_DrawerClosedPlaying() {
        
        DrawerClosedPlaying instance = DrawerClosedPlaying.getInstance();
        DVDPlayer player = DVDPlayer.getInstance();
        player.playButtonPushed();
        player.playButtonPushed();
        assertThat(instance, is(player.state));
    }
    
   @Test
    public void stopButtonPushed_when_DrawerClosedPlaying() {
        
        DrawerClosedNotPlaying instance = DrawerClosedNotPlaying.getInstance();
        DVDPlayer player = DVDPlayer.getInstance();
        player.playButtonPushed();
        player.stopButtonPushed();
        assertThat(instance, is(player.state));
    }
    
    
    
}
	
	
	
	
	
	
	
	
	
	
	
	

