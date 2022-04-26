package observerpattern;

public class PhoneDisplay implements IObserver, IDisplay{
    public String displayValue = "";
    // Same comment in WindowDisplay goes here
    private WeatherStation weatherStation;

    public PhoneDisplay(WeatherStation weatherStation) {
        this.weatherStation = weatherStation;
    }

    @Override
    public void Update() {
        displayValue = String.valueOf(weatherStation.getTemperature());
        display();
    }

    @Override
    public void display() {
        System.out.print("Phone Display : Current weather is ");
        System.out.println(displayValue);
    }
}
