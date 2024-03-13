package oving7;

import java.util.ArrayList;
import java.util.List;

public abstract class ObservableList {
    protected List<ObservableListListener> listeners = new ArrayList();

    protected void notifyListeners(int changeIndex){
        for(ObservableListListener listener:listeners){
            listener.listChanged(this,changeIndex);
        }
    }
    protected void addObservableListListener(ObservableListListener listener){
        listeners.add(listener);
    }
    protected void removeObservableListListener(ObservableListListener listener){
        listeners.remove(listener);
    }
}
