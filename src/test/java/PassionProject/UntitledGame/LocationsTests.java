package PassionProject.UntitledGame;

import PassionProject.UntitledGame.Locations;
import java.awt.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LocationsTests {
    List emptyList = new List();

    @Test
    public void test1LocationConstruct() {
        Locations room = new Locations("", "", "", emptyList);
        assertNotNull(room);
    }

    @Test
    public void test2LocationConstruct() {
        List strList = new List();
        Locations room = new Locations("RoomA", "First room", "Contains 3 branching paths", strList);
        assertNotNull(room);
    }

    @Test
    public void test1LocationGetName() {
        Locations room = new Locations("Room1", "First room", "Has no branching paths", emptyList);
        assertTrue(room.getLocationName().equals("Room1"));
    }

    @Test
    public void test1LocationSetName() {
        Locations room = new Locations("", "First room", "No branching paths", emptyList);
        assertTrue(room.getLocationName().equals(""));
        room.setLocationName("Room1");
        assertTrue(room.getLocationName().equals("Room1"));
    }

    @Test
    public void test1LocationGetInitDesc() {
        Locations room = new Locations("", "First room", "", emptyList);
        assertTrue(room.getInitDesc().equals("First room"));
    }


}
