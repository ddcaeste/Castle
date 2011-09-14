package castle.controllers;

import castle.models.CastleModel;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

/**
 *
 * @author Dieter Decaestecker
 */
public class CastleMouseListener implements MouseListener, MouseMotionListener
{
    private CastleModel castleModel;
    public CastleMouseListener(CastleModel castleModel) 
    {
        this.castleModel = castleModel;
    }
    @Override
    public void mouseClicked(MouseEvent e) {   castleModel.mouseClicked(e);  }
    @Override
    public void mousePressed(MouseEvent e) {   castleModel.mousePressed(e);  }
    @Override
    public void mouseReleased(MouseEvent e){   castleModel.mouseReleased(e); }
    @Override
    public void mouseEntered(MouseEvent e) {   castleModel.mouseEntered(e);  }
    @Override
    public void mouseExited(MouseEvent e)  {   castleModel.mouseExited(e);   }
    @Override
    public void mouseDragged(MouseEvent e) {   castleModel.mouseDragged(e);  }
    @Override
    public void mouseMoved(MouseEvent e)   {   castleModel.mouseMoved(e);    }
}
