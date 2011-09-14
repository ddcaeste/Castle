package castle.views;

import castle.constants.Dimensions;
import castle.constants.Strings;
import castle.constants.controllers.CastleKeyListener;
import castle.models.CastleModel;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/**
 *
 * @author Dieter Decaestecker
 */
public class CastleFrame extends JFrame implements ChangeListener
{
    private CastleModel castleModel;
    public CastleFrame(CastleModel castleModel) 
    {
        super(Strings.FRAME_NAME);
        
        // Save model
        this.castleModel = castleModel;
        castleModel.addChangeListener(this);
        // Options
        addKeyListener(new CastleKeyListener(castleModel));
        setContentPane(castleModel.getCurrentScreen());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        // Ready to become visible
        setVisible(true);
    }
    @Override
    public Dimension getPreferredSize()
    {
        return Dimensions.PREFERRED_STARTUP_SIZE;
    }
    @Override
    public void stateChanged(ChangeEvent e)
    {
        if(getContentPane()!=castleModel.getCurrentScreen())
        {   // Change screen
            setContentPane(castleModel.getCurrentScreen());
            pack();
        }
    }
}
