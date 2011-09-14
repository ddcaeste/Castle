package castle.views.screens;

import castle.models.CastleModel;
import castle.views.components.PixelButton;
import java.awt.Button;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/**
 *
 * @author Dieter Decaestecker
 */
public abstract class Screen extends JPanel implements ChangeListener
{
    protected CastleModel castleModel;
    protected ArrayList<PixelButton> buttons;   // Used for checking if the mouse is hovering over something
    protected PixelButton hoveredOverButton;    // Which button is hovered over
    public Screen(CastleModel castleModel)
    {
        this.castleModel = castleModel;
        this.buttons = new ArrayList<PixelButton>();
        this.hoveredOverButton = null;
        castleModel.addChangeListener(this);
    }
    public abstract void paintScreen(Graphics2D g2D);
    public abstract void keyTyped(KeyEvent e); 
    public abstract void keyPressed(KeyEvent e); 
    public abstract void keyReleased(KeyEvent e); 
    public abstract void mouseClicked(MouseEvent e); 
    public void mousePressed(MouseEvent e)
    {
        if(hoveredOverButton!=null)
        {
            hoveredOverButton.click();
        }
    }
    public abstract void mouseReleased(MouseEvent e); 
    public abstract void mouseEntered(MouseEvent e); 
    public abstract void mouseExited(MouseEvent e); 
    public abstract void mouseDragged(MouseEvent e); 
    public void mouseMoved(MouseEvent e)
    {
        if(hoveredOverButton!=null)
        {
            if(!checkIfInButton(e, hoveredOverButton))
            {
                hoveredOverButton.setHoveredOver(false);
                hoveredOverButton = null;
                stateChanged(null);
            }
        }
        for(PixelButton button : buttons)
        {
            if(checkIfInButton(e, button))
            {
                button.setHoveredOver(true);
                hoveredOverButton = button;
                stateChanged(null);
                break;
            }
        }
    }
    @Override
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        Graphics2D g2D = (Graphics2D) g;
        g2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
        paintScreen(g2D);
    }
    @Override
    public void stateChanged(ChangeEvent e) 
    {
        repaint();
    }
    private boolean checkIfInButton(MouseEvent e,PixelButton button)
    {
        int topLeftX = button.getCenter().x - 50;
        int topLeftY = button.getCenter().y - 50;
        if(e.getX() < topLeftX + 100 && e.getX() > topLeftX && e.getY() < topLeftY + 100 && e.getY() > topLeftY)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
