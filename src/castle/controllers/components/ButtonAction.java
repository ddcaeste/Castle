package castle.controllers.components;

import castle.models.CastleModel;

/**
 *
 * @author Dieter Decaestecker
 */
public abstract class ButtonAction 
{
    protected CastleModel castleModel;
    public ButtonAction(CastleModel castleModel) 
    {
        this.castleModel = castleModel;
    }
    public abstract void doAction();
}
