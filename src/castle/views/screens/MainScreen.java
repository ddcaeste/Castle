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
public class MainScreen extends Screen 
{
    public MainScreen(CastleModel castleModel) 
    {
        super(castleModel);
    }
    @Override
    public void paintScreen(Graphics2D g2D) 
    {
        g2D.setFont(Fonts.MAIN_FONT);
        Painter.paintCenteredString(g2D, "Main menu", getWidth()/2, getHeight()*2/10);
    }
    @Override
    public void keyTyped(KeyEvent e) 
    {
    }
    @Override
    public void keyPressed(KeyEvent e) 
    {
    }
    @Override
    public void keyReleased(KeyEvent e) 
    {
    }
    @Override
    public Color getBackground()
    {
        return Colors.MAIN_BACKGROUND;
    }
}
