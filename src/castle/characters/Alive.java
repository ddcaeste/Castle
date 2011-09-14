package castle.characters;

/**
 *
 * @author Dieter Decaestecker
 */
public abstract class Alive
{
    private final String name;
    public Alive(String name) 
    {
        this.name = name;
    }
    public String getName() 
    {
        return name;
    }
}
