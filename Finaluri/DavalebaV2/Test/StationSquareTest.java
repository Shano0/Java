import ge.edu.btu.Passenger;
import ge.edu.btu.Train;
import org.junit.Test;

import static org.junit.Assert.*;

public class StationSquareTest {

        @Test
        public void AddPassangerTest() {

            Passenger Passanger1 = new Passenger("Passanger1", true);
            Passenger Passanger2 = new Passenger("Passanger2", false);

            Train train = new Train();
            assertEquals(true, train.addPassanger(Passanger1));
            assertEquals(false, train.addPassanger(Passanger2));

        }

}
