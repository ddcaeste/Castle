package castle.views.screens;

import castle.models.CastleModel;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.KeyEvent;
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
    public Screen(CastleModel castleModel)
    {
        this.castleModel = castleModel;
        castleModel.addChangeListener(this);
    }
    public abstract void paintScreen(Graphics2D g2D);
    public abstract void keyTyped(KeyEvent e); 
    public abstract void keyPressed(KeyEvent e); 
    public abstract void keyReleased(KeyEvent e); 
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
}
