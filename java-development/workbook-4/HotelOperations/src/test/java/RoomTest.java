import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RoomTest {
    @Test
    public void checkIn_shouldBe_OccupiedAndDirty(){
        Room room = new Room(1 , 70);

        room.checkIn();

        assertTrue(room.isOccupied());
        assertTrue(room.isDirty());



    }
    @Test
public void checkout_RoomIsOccupied_RoomIsNotOccupied(){
        Room room = new Room(2 , 100);

        room.checkout();

        assertFalse(room.isOccupied());
    }

    @Test
    public void checkIn_RoomWasPreviouslyUsed_RoomNotOccupied(){
        Room room = new Room(2 , 100);

        room.checkIn();

        assertFalse(room.isAvailable());
    }

}
