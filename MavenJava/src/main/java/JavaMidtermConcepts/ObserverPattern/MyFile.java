package JavaMidtermConcepts.ObserverPattern;

import java.util.ArrayList;
import java.util.List;


public class MyFile extends Node {
    private List<Observer> observers = new ArrayList<>();

    public MyFile(String name, Directory parent) {
        super(name, parent);
    }

    public void attach(Observer observer) {
        if (!observers.contains(observer)) {
            observers.add(observer);
        }
    }

    public void detach(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }

    public void write(String content) {
        notifyObservers();
    }
}
