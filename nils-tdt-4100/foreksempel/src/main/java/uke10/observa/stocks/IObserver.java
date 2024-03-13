package uke10.observa.stocks;

public interface IObserver {
    public void update(IObservable subject, String what);
}
