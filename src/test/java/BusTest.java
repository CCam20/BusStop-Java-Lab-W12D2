import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {

    private Bus bus;
    private Person person;
    private BusStop busStop;

    @Before
    public void before(){
        bus = new Bus("Central", 5);
        person = new Person();
        busStop = new BusStop("Central");
        busStop.addPassenger(person);
        busStop.addPassenger(person);
        busStop.addPassenger(person);
        busStop.addPassenger(person);
        busStop.addPassenger(person);
        busStop.addPassenger(person);

    }
    @Test
    public void getNumberOfPassengersOnBus(){
        assertEquals(0, bus.numberOfPassengers());
    }
    @Test
    public void addPassengerToBusTest(){
        bus.addPassenger(busStop);
        assertEquals(1, bus.numberOfPassengers());
    }
    @Test
    public void wontAddToBusWhenFull(){
        bus.addPassenger(busStop);
        bus.addPassenger(busStop);
        bus.addPassenger(busStop);
        bus.addPassenger(busStop);
        bus.addPassenger(busStop);
        assertEquals(5, bus.numberOfPassengers());
    }
    @Test
    public void removePassengerFromBus(){
        bus.addPassenger(busStop);
        bus.removePassenger();
        assertEquals(0, bus.numberOfPassengers());
    }
//    @Test
//    public void getPassangerFromQueue(){
//
//    }



}

//    Create a Bus class with a destination, capacity and an initially empty ArrayList, passengers of type Person
//        Create a method to return the number of passengers on the bus.
//        Create a method to add a passenger onto the bus only if the passenger count is less than the capacity.
//        Create a method to remove a passenger from the bus.