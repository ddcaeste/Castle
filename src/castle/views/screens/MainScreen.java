package castle.views.screens;

import castle.auxiliary.Painter;
import castle.constants.Colors;
import castle.constants.Fonts;
import castle.constants.Strings;
import castle.controllers.components.NewGameButtonAction;
import castle.models.CastleModel;
import castle.views.components.PixelButton;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
 
/**
 *
 * @author Dieter Decaestecker
 */
public class MainScreen extends Screen 
{
    private final PixelButton NEW_GAME;
    public MainScreen(CastleModel castleModel) 
    {
        super(castleModel);
        
        // Main menu
        NEW_GAME = new PixelButton(Strings.NEW_GAME_BUTTON,Fonts.MAIN_BUTTONS_FONT,Fonts.MAIN_BUTTONS_HOVERED_OVER_FONT,new NewGameButtonAction(castleModel),new Point(300,240));
        
        buttons.add(NEW_GAME);
    }
    @Override
    public void paintScreen(Graphics2D g2D) 
    {
        g2D.setFont(Fonts.MAIN_FONT);
        Painter.paintCenteredString(g2D, Strings.MAIN_MENU_TITLE, 300, 120);
        NEW_GAME.paint(g2D);
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
    @Override
    public void mouseClicked(MouseEvent e)
    {
    }
    @Override
    public void mousePressed(MouseEvent e) 
    {
        super.mousePressed(e);
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
        super.mouseMoved(e);
    }
}
