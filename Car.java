import java.util.ArrayList;


//the `Car` class
public class Car {

    // - an `ArrayList` where it will store the `Passenger`s currently onboard, and an `int` for the `Car`'s maximum capacity (since `ArrayList`s will expand as we add objects, we'll need to manually limit their size)
    private ArrayList <Passenger> passengers; 
    private int maxCapacity;

    // - a constructor, which takes in an initial value for the `Car`'s maximum capacity and initializes an appropriately-sized `ArrayList`
    public Car (int maxCapacity){
        this.maxCapacity=maxCapacity;
        this.passengers=new ArrayList<>();
    }
    // - accessor-like methods `public int getCapacity()` and `public int seatsRemaining()` that return the maximum capacity and remaining seats, respectively
    public int getCapacity(){
        return maxCapacity;
    }
    public int seatsRemaining (){
        return maxCapacity-passengers.size();
    }

    // - `addPassenger(Passenger p)` and `removePassenger(Passenger p)` methods to add or remove a `Passenger` from the `Car` and return `True` if the operation was successful, and `False` otherwise. (_Hint: don't forget to check that there are seats available if someone wants to board, and to confirm that the `Passenger` is actually onboard before trying to remove them! If you encounter a problem, you should `return False`._)
    public boolean addPassenger(Passenger p){
        if (passengers.size()< maxCapacity){
            passengers.add(p);
            return true;

        }
        return false;
    }
    public boolean removePassenger(Passenger p){
        return passengers.remove(p);
    }

    // - and a final method `printManifest()` that prints out a list of all `Passenger`s aboard the car (or "This car is EMPTY." if there is no one on board).
    public void printManifest(){
        if (passengers.isEmpty()){
            System.out.println("This car is EMPTY.");
        } else {
            System.out.println(" Passengers are on board: ");
            for (Passenger p: passengers){
                System.out.println("- " + p.toString());
            }
        }
    }


}





