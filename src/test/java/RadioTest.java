import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    Radio radio = new Radio();
    @Test
    public void shouldUseDefaultConstructor() {
        Radio radio = new Radio();
        assertEquals(0, radio.getNumberStation());
        assertEquals(0, radio.getVolume());
        assertEquals(10, radio.getMaxVolume());
        assertEquals(0, radio.getMinVolume());
        assertEquals(9, radio.getMaxStation());
        assertEquals(0, radio.getMinStation());
    }


    @Test
    public void RadioStationUp() {
        Radio radio = new Radio(10);

        assertEquals(0, radio.getNumberStation());
    }
}