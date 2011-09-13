package castle.models;

import castle.constants.Screens;
import castle.views.screens.Screen;

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
        currentScreen = screen.BOOT_UP_SCREEN;
    }
    public Screen getCurrentScreen() 
    {
        return currentScreen;
    }
}
