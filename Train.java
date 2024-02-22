import java.util.ArrayList;

public class Train {

    //an `Engine`
    private Engine engine;
    //an `ArrayList` to keep track of the `Car`s currently attached
    private ArrayList<Car> cars;

    //a constructor `Train(FuelType fuelType, double fuelCapacity, int nCars, int passengerCapacity)` which will initialize the `Engine` and `Car`s and store them
    public Train (FuelType fuelType, double fuelCapacity, int nCars, int passengerCapacity){
        this.engine=new Engine (fuelType, fuelCapacity);
        this.cars=new ArrayList<>();

        for (int i=0; i<nCars; i++) {
            cars.add(new Car(passengerCapacity));
        }
    }
    //`public Engine getEngine()`
    public Engine getEngine(){
        return engine;
    }
    //`public Car getCar(int i)` to return the `i`th car
    public Car getCar(int i){
        if (i>= 0 && i < cars .size()){
            return cars.get(i);
        }
         return null;

    }
    //`public int getMaxCapacity()` which will return the maximum total capacity across all `Car`s
    public int getMaxCapacity() {
        int maxCapacity =0;
        for (Car car : cars) {
            maxCapacity+=car.getCapacity();

        }

        return maxCapacity;
    }
    //`public int seatsRemaining()` which will return the number of remaining open seats across all `Car`s
    public int seatsRemaining (){
        int totalSeats = getMaxCapacity();
        int occupiedSeats=0;
        for (Car car : cars) {
            occupiedSeats+=car.getCapacity()-car.seatsRemaining();
        }

        return totalSeats - occupiedSeats;
    }

    //- and finally, its own `printManifest()` that prints a roster of all `Passenger`s onboard (_Hint: ask your `Car`s to help!_)
    public void printManifest(){
        System.out.println("passenger`s on board: ");
        for (Car car : cars) {
            car.printManifest();
        }
    }

    public static void main (String []args){
        Train myTrain= new Train(FuelType.ELECTRIC, 6, 4, 50);
        while (myTrain.getEngine().go()){
            System.out.println(" Choo choo!");
        }

        System.out.println("running out of fuel..");
    }

}








