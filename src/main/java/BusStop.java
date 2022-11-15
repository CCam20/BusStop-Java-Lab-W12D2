import java.util.ArrayList;

public class BusStop {

    private String name;
    private ArrayList<Person> queue;

    public BusStop(String name){
        this.name = name;
        this.queue = new ArrayList<Person>();
    }

    public int getNumberInQueue() {
        return this.queue.size();
    }

    public void addPassenger(Person person) {
        this.queue.add(person);
    }

    public Person removePassenger() {
        return this.queue.remove(0);
    }
}


//    Add a BusStop class which interacts with the other two.
//        BusStop should have a name and an initially empty ArrayList of type "Person" called queue.
//        Add a method to add a person to the queue.
//        Add a method to remove a person from the queue.
//        Create a pickUp method in Bus that gets a person from bus stop and adds to the bus passengers.