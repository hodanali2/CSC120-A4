public class Engine {
    //a `FuelType` attribute to indicate what type of fuel it uses, and `double`s to store the current 
    //and maximum fuel levels (along with appropriate accessors for each)
    
    private FuelType fuelType;
    private double currentFuelLevel;
    private double maxFuelLevel;

    //a constructor, which takes in initial values for the attributes named above and sets them appropriately
    public Engine (FuelType fuelType, double maxFuelLevel) {
        this.fuelType=fuelType;
        this.currentFuelLevel=maxFuelLevel;
        this.maxFuelLevel=maxFuelLevel;   

    }
    //a `refuel()` method which will reset the `Engine`'s current fuel level to the maximum, and which doesn't need to `return` anything
    public void refuel() {
        this.currentFuelLevel=maxFuelLevel;
    }

    //a `go()` which will decrease the current fuel level, print some useful information (e.g. remaining fuel level), and return `True` if the fuel level is above 0 and `False` otherwise.

    public boolean go(){
        if (currentFuelLevel > 0) {
            System.out.println("remaining fuel level: " + currentFuelLevel );
            currentFuelLevel --;


            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Engine myEngine = new Engine(FuelType.ELECTRIC, 100.0);
        while (myEngine.go()) {
            System.out.println("Choo choo!");
        }
        System.out.println("Out of fuel.");
    




    }
}









