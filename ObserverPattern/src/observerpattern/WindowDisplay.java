package observerpattern;

public class WindowDisplay implements IObserver, IDisplay{
    // Assume that this display is a weather display
    public float displayValue = 0;
    // Yes, coupling to the concretion is not a
    // good idea, there is probably some better way to do this
    // yes, but for another discussion
    // at-least it's better than coupling concretion in abstraction
    public WeatherStation weatherStation;

    public WindowDisplay(WeatherStation weatherStation) {
        this.weatherStation = weatherStation;
    }

    @Override
    public void Update() {
        // Coupling to concretion in ctor was to get the
        // getTemperature() method
        // It won't be possible if the type was of interface
        displayValue = weatherStation.getTemperature();
        display();
    }

    @Override
    public void display() {
        System.out.print("Window Display : Current Temperature is ");
        System.out.println(displayValue);
    }
}
