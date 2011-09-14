package castle.views.screens;

import castle.constants.Colors;
import castle.models.CastleModel;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

/**
 *
 * @author Dieter Decaestecker
 */
public class GameScreen extends Screen
{
    public GameScreen(CastleModel castleModel) 
    {
        super(castleModel);
    }
    @Override
    public void paintScreen(Graphics2D g2D) 
    {
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
    public void mouseClicked(MouseEvent e) 
    {
    }
    @Override
    public void mousePressed(MouseEvent e) 
    {
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
    @Override
    public Color getBackground()
    {
        return Colors.GAME_BACKGROUND;
    }
}
