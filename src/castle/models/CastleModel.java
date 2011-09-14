package castle.models;

import castle.constants.Screens;
import castle.views.screens.Screen;
import java.awt.event.KeyEvent;

/**
 *
 * @author Dieter Decaestecker
 */
public class CastleModel extends Model
{
    private final Screens screen;   // Class that contains all information about the screens
    private Screen currentScreen;   // Current screen being shown
    public CastleModel() 
    {
        // Register all screens to this model
        screen = new Screens(this);
        setCurrentScreen(screen.BOOT_UP_SCREEN);
    }
    public void setCurrentScreen(Screen currentScreen) 
    {
        this.currentScreen = currentScreen;
        fireStateChanged();
    }
    public Screen getCurrentScreen() 
    {
        return currentScreen;
    }
    public Screens getScreen() 
    {
        return screen;
    }
    public void keyTyped(KeyEvent e) 
    {
        currentScreen.keyTyped(e);
    }
    public void keyPressed(KeyEvent e) 
    {
        currentScreen.keyPressed(e);
    }
    public void keyReleased(KeyEvent e) 
    {
        currentScreen.keyReleased(e);
    }
}
