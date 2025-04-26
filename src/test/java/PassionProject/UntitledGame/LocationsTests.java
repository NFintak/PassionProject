package PassionProject.UntitledGame;

import PassionProject.UntitledGame.Locations;
import java.awt.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LocationsTests {

    @Test
    public void test1LocationConstruct() {
        Locations room = new Locations("", "", "", 0);
        assertNotNull(room);
    }

    @Test
    public void test2LocationConstruct() {
        Locations room = new Locations("RoomA", "First room", "Contains 3 branching paths", 0);
        assertNotNull(room);
    }

    @Test
    public void test1LocationGetName() {
        Locations room = new Locations("Room1", "First room", "Has no branching paths", 0);
        assertTrue(room.getLocationName().equals("Room1"));
    }

    @Test
    public void test1LocationSetName() {
        Locations room = new Locations("", "First room", "No branching paths", 0);
        assertTrue(room.getLocationName().equals(""));
        room.setLocationName("Room1");
        assertTrue(room.getLocationName().equals("Room1"));
    }

    @Test
    public void test1LocationGetInitDesc() {
        Locations room = new Locations("", "First room", "", 0);
        assertTrue(room.getInitDesc().equals("First room"));
    }


}
