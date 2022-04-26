package observerpattern;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements IObservable{
    public float temperature;
    public List<IObserver> observers;
    public WeatherStation() {
        this.temperature = 30.00F;
        observers = new ArrayList<>();
    }

    @Override
    public void add(IObserver observer) {
        observers.add(observer);
    }

    @Override
    public void remove(IObserver observer) {
        observers.remove(observers);
    }

    @Override
    public void notifyObservers() {
        for (IObserver observer : observers) {
            observer.Update();
        }
    }

    public float getTemperature() {
        return temperature;
    }

    public void updateTemperature()
    {
        temperature += Math.random() * 10 - 5;
        notifyObservers();
    }
}
