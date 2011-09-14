package castle.controllers.components;

import castle.models.CastleModel;

/**
 *
 * @author Dieter Decaestecker
 */
public class NewGameButtonAction extends ButtonAction
{
    public NewGameButtonAction(CastleModel castleModel) 
    {
        super(castleModel);
    }
    @Override
    public void doAction() 
    {
        castleModel.setCurrentScreen(castleModel.getScreen().GAME_SCREEN);
    }
}
