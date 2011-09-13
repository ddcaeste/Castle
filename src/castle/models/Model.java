package castle.models;

import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.EventListenerList;

public abstract class Model
{  

    private EventListenerList listenerList = new EventListenerList ();

    public void addChangeListener (ChangeListener l)
    {
        listenerList.add (ChangeListener.class, l);
    }

    public void removeChangeListener (ChangeListener l)
    {
        listenerList.remove (ChangeListener.class, l);
    }

    private final ChangeEvent changeEvent = new ChangeEvent (this);

    protected void fireStateChanged ()
    {
        Object[] listeners = listenerList.getListenerList ();
        for (int i=listeners.length-2; i >= 0; i-=2)
        {
            if (listeners[i] == ChangeListener.class)
                ((ChangeListener)listeners[i+1]).stateChanged (changeEvent);
        }
    }
}
