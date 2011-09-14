package castle.models;

import castle.characters.MainCharacter;
import castle.constants.initialisation.Screens;
import castle.views.screens.Screen;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

/**
 *
 * @author Dieter Decaestecker
 */
public class CastleModel extends Model
{
    private final Screens screen;   // Class that contains all information about the screens
    private Screen currentScreen;   // Current screen being shown
    private MainCharacter mainCharacter;    // The character the player plays as
    public CastleModel() 
    {
        // Register all screens to this model
        this.screen = new Screens(this);
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
    public void mouseClicked(MouseEvent e) 
    {
        currentScreen.mouseClicked(e);
    }
    public void mousePressed(MouseEvent e) 
    {
        currentScreen.mousePressed(e);
    }
    public void mouseReleased(MouseEvent e) 
    {
        currentScreen.mouseReleased(e);
    }
    public void mouseEntered(MouseEvent e) 
    {
        currentScreen.mouseEntered(e);
    }
    public void mouseExited(MouseEvent e) 
    {
        currentScreen.mouseExited(e);
    }
    public void mouseDragged(MouseEvent e) 
    {    
        currentScreen.mouseDragged(e);
    }
    public void mouseMoved(MouseEvent e) 
    {
        currentScreen.mouseMoved(e);
    }
}
