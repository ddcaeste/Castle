package castle.auxiliary;

import java.awt.FontMetrics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;

/**
 *
 * @author Dieter Decaestecker
 */
public abstract class Painter 
{
    // Includes help classes for painting things
    public static void paintCenteredString(Graphics2D g2D, String string, int xCoordinate, int yCoordinate)
    {
        FontMetrics fm   = g2D.getFontMetrics(g2D.getFont());
        Rectangle2D rect = fm.getStringBounds(string, g2D);

        int textHeight = (int)(rect.getHeight()); 
        int textWidth  = (int)(rect.getWidth());
        
        g2D.drawString(string, xCoordinate - textWidth/2, yCoordinate - textHeight/2);
    }
}
