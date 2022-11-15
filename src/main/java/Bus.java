import java.util.ArrayList;

public class Bus {

    private String destination;
    private int capacity;
    private ArrayList<Person> passengers ;

    public Bus(String destination, int capacity){
        this.destination = destination;
        this.capacity = capacity;
        this.passengers = new ArrayList<Person>();
    }

    public int numberOfPassengers() {
        return this.passengers.size();
    }

    public void addPassenger(BusStop busStop) {
        if(this.capacity > this.numberOfPassengers()) {
           Person person = busStop.removePassenger();
            passengers.add(person);
        }
    }

    public void removePassenger() {
        passengers.remove(0);
    }
}
//    Add a BusStop class which interacts with the other two.
//        BusStop should have a name and an initially empty ArrayList of type "Person" called queue.
//        Add a method to add a person to the queue.
//        Add a method to remove a person from the queue.
//        Create a pickUp method in Bus that gets a person from bus stop and adds to the bus passengers.

