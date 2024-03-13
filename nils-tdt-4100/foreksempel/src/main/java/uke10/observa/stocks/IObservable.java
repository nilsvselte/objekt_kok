package uke10.observa.stocks;

public interface IObservable {
    
    public void addListener(IObserver listener);
    public void removeListener(IObserver listener);
    public void notifyListeners(String what);
    public double getValue(String what);

}
