package castle.views;

import castle.constants.Dimensions;
import castle.constants.Strings;
import castle.models.CastleModel;
import java.awt.Dimension;
import javax.swing.JFrame;

/**
 *
 * @author Dieter Decaestecker
 */
public class CastleFrame extends JFrame
{
    private CastleModel castleModel;
    public CastleFrame(CastleModel castleModel) 
    {
        super(Strings.FRAME_NAME);
        
        // Save model
        this.castleModel = castleModel;
        // Options
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
}
