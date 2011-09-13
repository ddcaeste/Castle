package castle.views.screens;

import castle.models.CastleModel;
import java.awt.Graphics2D;
import javax.swing.event.ChangeEvent;

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
        g2D.drawLine(0, 0, 100, 100);
    }
}
