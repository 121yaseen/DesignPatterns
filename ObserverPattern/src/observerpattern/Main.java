package observerpattern;
// Observer pattern in essence is about poll vs push
// Imagine we have a module whose states will be changed
// once in a while for some reason, and we have other modules
// that need to be changed according to the change in the 1st one
// We can call the 1st module and observable(aka subject) and the rest as observers
// So for getting changes from observable, observers will constantly poll
// And that is absurd
// Observer patterns solves this problem by pushing changes from
// observer to observables whenever change from one state to another happen
// Observers will have to register with observable

// Observer pattern defines a one to many relationship between objects
// so that when one object changes its state, all of its dependencies are
// notified and updated automatically
public class Main {
    public static void main(String[] args) {
        System.out.println("Observer Pattern Main");

        var weatherStation = new WeatherStation();
        PhoneDisplay phoneDisplay = new PhoneDisplay(weatherStation);
        WindowDisplay windowDisplay = new WindowDisplay(weatherStation);

        weatherStation.add(phoneDisplay);
        weatherStation.add(windowDisplay);

        weatherStation.updateTemperature();

        // The implementation here is actually more of a push-pull format
        // The observable (WeatherStation) will push the fact that
        // the change has been happened to its registered observers (via notify())
        // and the observers(PhoneDisplay and WindowDisplay) will pull the changed data
        // from the observable.
        // There are multiple ways to refactor this and avoid the concretion
        // and also to change the push-pull to push-push or other things.
        // But in all of those scenarios the core idea remains the same
        // which is to change the polling method to push method
    }
}
