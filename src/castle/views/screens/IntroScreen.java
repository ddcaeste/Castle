package castle.views.screens;

import castle.auxiliary.Painter;
import castle.constants.Colors;
import castle.constants.Fonts;
import castle.models.CastleModel;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;

/**
 *
 * @author Dieter Decaestecker
 */
public class IntroScreen extends Screen
{
    public IntroScreen(CastleModel castleModel) 
    {
        super(castleModel);
    }
    @Override
    public void paintScreen(Graphics2D g2D) 
    {
        g2D.setFont(Fonts.INTRO_FONT);
        // Needs... work.
        Painter.paintCenteredString(g2D, "Castle", getWidth()/2, getHeight()/2);
        Painter.paintCenteredString(g2D, "Press any key to start", getWidth()/2, 40+getHeight()/2);
    }
    @Override
    public void keyTyped(KeyEvent e) 
    {
    }
    @Override
    public void keyPressed(KeyEvent e) 
    {
        castleModel.setCurrentScreen(castleModel.getScreen().MAIN_SCREEN);
    }
    @Override
    public void keyReleased(KeyEvent e) 
    {
    }
    @Override
    public Color getBackground()
    {
        return Colors.INTRO_BACKGROUND;
    }
}
