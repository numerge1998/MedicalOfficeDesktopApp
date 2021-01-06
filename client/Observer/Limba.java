package client;

import java.util.ArrayList;

public class Limba implements IInterfata{
    private String limbaa;
    private ArrayList<IObserver> observers = new ArrayList<>();

    public Limba(String romana) {
        this.limbaa = romana;
        Observer obs = new Observer(this);
    }

    public String getLimbaa() {
        return limbaa;
    }

    @Override
    public void RegisterObserver(IObserver observer) {
        observers.add(observer);
    }

    /*public ArrayList<IObserver> getObservers() {
        return observers;
    }*/

    @Override
    public void RemoveObserver(IObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void NotifyObservers() {
       // Observer obs = new Observer(this);
        for(IObserver s1:observers)
            s1.update(this.limbaa);
    }

    public void setLimbaa(String limbaa) {

        this.limbaa = limbaa;
        this.NotifyObservers();
    }
}
