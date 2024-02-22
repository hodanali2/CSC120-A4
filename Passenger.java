public class Passenger {
    
    private String name;

    public Passenger(String name) {
        this.name = name;
    }

    //  - `boardCar(Car c)` can call `c.addPassenger(this)` to board a given `Car` (_Hint: this method should check the value that gets `return`ed by `c.addPassenger(...)` in case the selected car is full._)
    public boolean boardCar(Car c) {
        return c.addPassenger(this);
    }

    //  - `getOffCar(Car c)` can call `c.removePassenger(this)` to get off a given `Car` (_Hint: this method should check the value that gets `return`ed by `c.removePassenger(...)` in case the `Passenger` wasn't actually onboard._)
    public boolean getOffCar(Car c){
        return c.removePassenger(this);
    }
}




