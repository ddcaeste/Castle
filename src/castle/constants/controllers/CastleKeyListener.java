package castle.constants.controllers;

import castle.models.CastleModel;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 *
 * @author Dieter Decaestecker
 */
public class CastleKeyListener implements KeyListener
{
    private CastleModel castleModel;
    public CastleKeyListener(CastleModel castleModel) 
    {
        this.castleModel = castleModel;
    }
    @Override
    public void keyTyped(KeyEvent e) 
    {
        castleModel.keyTyped(e);
    }
    @Override
    public void keyPressed(KeyEvent e) 
    {
        castleModel.keyPressed(e);
    }
    @Override
    public void keyReleased(KeyEvent e) 
    {
        castleModel.keyReleased(e);
    }
}
