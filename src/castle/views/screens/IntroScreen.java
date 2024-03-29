package castle.views.screens;

import castle.auxiliary.Painter;
import castle.constants.Colors;
import castle.constants.Fonts;
import castle.constants.Strings;
import castle.models.CastleModel;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

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
        Painter.paintCenteredString(g2D, Strings.FRAME_NAME, getWidth()/2, getHeight()/2);
        Painter.paintCenteredString(g2D, Strings.INTRO_COMMAND, getWidth()/2, 40+getHeight()/2);
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
    @Override
    public void mouseClicked(MouseEvent e)
    {
    }
    @Override
    public void mousePressed(MouseEvent e) 
    {
        castleModel.setCurrentScreen(castleModel.getScreen().MAIN_SCREEN);
    }
    @Override
    public void mouseReleased(MouseEvent e)
    {
    }
    @Override
    public void mouseEntered(MouseEvent e) 
    {
    }
    @Override
    public void mouseExited(MouseEvent e) 
    {
    }

    @Override
    public void mouseDragged(MouseEvent e) 
    {
    }
    @Override
    public void mouseMoved(MouseEvent e) 
    {
    }
}
