package castle.views.components;

import castle.auxiliary.Painter;
import castle.constants.Colors;
import castle.controllers.components.ButtonAction;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Point;

/**
 *
 * @author Dieter Decaestecker
 */
public class PixelButton 
{
    private String title;
    private Point center;
    private Font font;
    private Font hoveredOverFont;
    private boolean hoveredOver;
    private ButtonAction action;
    
    public PixelButton(String title, Font font, Font hoveredOverFont, ButtonAction action, Point center) 
    {
        this.title = title;
        this.font = font;
        this.hoveredOverFont = hoveredOverFont;
        this.action = action;
        this.hoveredOver = false;
        this.center = center;
    }
    public void click()
    {
        action.doAction();
    }
    public boolean isHoveredOver() 
    {
        return hoveredOver;
    }
    public void setHoveredOver(boolean hoveredOver) 
    {
        this.hoveredOver = hoveredOver;
    }
    public Point getCenter() 
    {
        return center;
    }
    public void paint(Graphics2D g2D)
    {
        if(!hoveredOver)
        {
            g2D.setFont(font);
            g2D.setColor(Colors.BUTTON_TEXT_COLOR);
        }
        else
        {
            g2D.setFont(hoveredOverFont);
            g2D.setColor(Colors.BUTTON_HOVERED_COLOR);
        }
        Painter.paintCenteredString(g2D, title, 
                                        center.x, 
                                        center.y);
    }
}
