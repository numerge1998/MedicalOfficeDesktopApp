package client;

public interface IInterfata {
    void RegisterObserver(IObserver observer);

    void RemoveObserver(IObserver observer);

    void NotifyObservers();

}
