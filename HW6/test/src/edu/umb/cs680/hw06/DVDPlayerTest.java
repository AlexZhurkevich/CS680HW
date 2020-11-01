package edu.umb.cs680.hw06;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.lang.*;

public class DVDPlayerTest{
    
    @Test
    public void check_two_singletons_is_the_same_object() {
        
        DVDPlayer instance = DVDPlayer.getInstance();
        DVDPlayer player = DVDPlayer.getInstance();
        //if (player.state == DrawerOpen.getInstance())
          //  player.openClosedButtonPushed();
        assertThat(instance, is(player));
    }
    
    @Test
    public void check_changestate() {
        
        DVDPlayer player = DVDPlayer.getInstance();
        DrawerOpen state_open = DrawerOpen.getInstance();
        player.changeState(state_open);
        assertThat(state_open,is(player.state));
        
    }

    @Test
    public void check_openCloseButtonPushed_when_ClosedNotPlaying() {
        DVDPlayer player = DVDPlayer.getInstance();
        player.changeState(DrawerClosedNotPlaying.getInstance());
        DrawerOpen state_open = DrawerOpen.getInstance();
        player.openClosedButtonPushed();
        assertThat(state_open,is(player.state));
    }
    
    @Test
    public void check_openCloseButtonPushed_when_ClosedPlaying() {
        DVDPlayer player = DVDPlayer.getInstance();
        player.changeState(DrawerClosedPlaying.getInstance());
        DrawerOpen state_open = DrawerOpen.getInstance();
        player.openClosedButtonPushed();
        assertThat(state_open,is(player.state));
    }
    
    @Test
    public void check_openCloseButtonPushed_when_Open() {
        DVDPlayer player = DVDPlayer.getInstance();
        player.changeState(DrawerOpen.getInstance());
        DrawerClosedNotPlaying state_open = DrawerClosedNotPlaying.getInstance();
        player.openClosedButtonPushed();
        assertThat(state_open,is(player.state));
    }
    
    @Test
    public void check_playButtonPushed_when_Closed() {
        DVDPlayer player = DVDPlayer.getInstance();
        player.changeState(DrawerClosedNotPlaying.getInstance());
        DrawerClosedPlaying state_playing = DrawerClosedPlaying.getInstance();
        player.playButtonPushed();
        assertThat(state_playing,is(player.state));
    }
    
    @Test
    public void check_playButtonPushed_when_ClosedPlaying() {
        DVDPlayer player = DVDPlayer.getInstance();
        player.changeState(DrawerClosedPlaying.getInstance());
        DrawerClosedPlaying state_playing = DrawerClosedPlaying.getInstance();
        player.playButtonPushed();
        assertThat(state_playing,is(player.state));
    }
    
    @Test
    public void check_playButtonPushed_when_Open() {
        DVDPlayer player = DVDPlayer.getInstance();
        player.changeState(DrawerOpen.getInstance());
        DrawerClosedPlaying state_open = DrawerClosedPlaying.getInstance();
        player.playButtonPushed();
        assertThat(state_open,is(player.state));
    }

    @Test
    public void check_stopButtonPushed_when_Closed() {
        DVDPlayer player = DVDPlayer.getInstance();
        player.changeState(DrawerClosedNotPlaying.getInstance());
        DrawerClosedNotPlaying state_closed = DrawerClosedNotPlaying.getInstance();
        player.stopButtonPushed();
        assertThat(state_closed,is(player.state));
    }
    
    @Test
    public void check_stopButtonPushed_when_ClosedPlaying() {
        DVDPlayer player = DVDPlayer.getInstance();
        player.changeState(DrawerClosedPlaying.getInstance());
        DrawerClosedNotPlaying state_closed = DrawerClosedNotPlaying.getInstance();
        player.stopButtonPushed();
        assertThat(state_closed,is(player.state));
    }
    
}
	
	
	
	
	
	
	
	
	
	
	
	

