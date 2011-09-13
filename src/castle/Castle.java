package castle;

import castle.models.CastleModel;
import castle.views.CastleFrame;
import javax.swing.UIManager;

/**
 *
 * @author Dieter Decaestecker
 */
public class Castle implements Runnable
{
    private CastleModel model;
    public Castle(CastleModel model)
    {
        this.model = model;
    }
    public static void main(String[] args) 
    {
        // Model initialisation
        CastleModel model = new CastleModel();
        // Starting the thread with models as argument
        Thread swingThread = new Thread(new Castle(model));
        swingThread.start();
    }
    @Override
    public void run() 
    {   // Init LookAndFeel
        try { UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName()); }
        catch (Exception e) { }
        // Init GUI
        CastleFrame frame = new CastleFrame(model);
    }
}
