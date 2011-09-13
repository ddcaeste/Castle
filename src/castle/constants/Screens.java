package castle.constants;

import castle.models.CastleModel;
import castle.views.screens.IntroScreen;
import castle.views.screens.MainScreen;
import castle.views.screens.Screen;
import java.util.ArrayList;

/**
 *
 * @author Dieter Decaestecker
 */
public class Screens 
{
    // All the possible screens the game has are initialised and stored here for easy access
    public final MainScreen         MAIN_SCREEN;
    public final IntroScreen        INTRO_SCREEN;   

    // Screen that shows up when application is launched
    public final Screen BOOT_UP_SCREEN;             
    
    public Screens(CastleModel castleModel)
    {
        MAIN_SCREEN     = new MainScreen(castleModel);
        INTRO_SCREEN    = new IntroScreen(castleModel);

        BOOT_UP_SCREEN = INTRO_SCREEN;
    }
    
}
