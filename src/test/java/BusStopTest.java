import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusStopTest {

    private Bus bus;
    private Person person;
    private BusStop busStop;

    @Before
    public void before(){
        bus = new Bus("Central", 5);
        busStop = new BusStop("Central");
        person = new Person();

    }
    @Test
    public void checkQueueIsEmpty(){
        assertEquals(0, busStop.getNumberInQueue());
    }

    @Test
    public void addPassengerToQueueTest(){
        busStop.addPassenger(person);
        assertEquals(1, busStop.getNumberInQueue());
    }
    @Test
    public void removePassengerFromQueueTest(){
        busStop.addPassenger(person);
        busStop.removePassenger();
        assertEquals(0, busStop.getNumberInQueue());
    }

}



//    Add a BusStop class which interacts with the other two.
//        BusStop should have a name and an initially empty ArrayList of type "Person" called queue.
//        Add a method to add a person to the queue.
//        Add a method to remove a person from the queue.
//        Create a pickUp method in Bus that gets a person from bus stop and adds to the bus passengers.