import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    Radio radio = new Radio();
    @Test
    public void shouldUseDefaultConstructor() {
        Radio radio = new Radio();
        assertEquals(1, radio.getVolume());
        assertEquals(10, radio.getMaxVolume());
        assertEquals(2, radio.getMinVolume());
        assertEquals(10, radio.getMaxStation());
        assertEquals(0, radio.getMinStation());
        assertEquals(10, radio.getStatNumber());
        assertEquals(1, radio.getVolUp());
        assertEquals(1, radio.getVolDown());
    }

    @Test
    public void RadioStationUp() {
        Radio radio = new Radio (10);
        assertEquals(10, radio.getStatNumber());

    }
    @Test
    public void RadioAll(){
        Radio radio = new Radio(2,13,2,2,1,3,3,2,3,true);
        assertEquals(2, radio.getNumberStation());
        assertEquals(13, radio.getVolume());
        assertEquals(2, radio.getMaxVolume());
        assertEquals(2, radio.getMinVolume());
        assertEquals(3,radio.getMinStation());
        assertEquals(3, radio.getMinStation());
        assertEquals(3, radio.getStatNumber());
        assertEquals(2, radio.getVolUp());
        assertEquals(3, radio.getVolDown());
        assertEquals(true,true);
    }

    @Test
    void getNumberStation() {
        assertEquals(2,radio.getNumberStation());
    }

    @Test
    void getVolume() {
        assertEquals(1,radio.getVolume());
    }

    @Test
    void getMaxVolume() {
        assertEquals(10,radio.getMaxVolume());
    }

    @Test
    void getMinVolume() {
        assertEquals(2,radio.getMinVolume());
    }

    @Test
    void getMaxStation() {
        assertEquals(10,radio.getMaxStation());
    }

    @Test
    void getMinStation() {
        assertEquals(0,radio.getMinStation());
    }

    @Test
    void getStatNumber() {
        assertEquals(10,radio.getStatNumber());
    }

    @Test
    void getVolUp() {
        assertEquals(1,radio.getVolUp());
    }

    @Test
    void getVolDown() {
        assertEquals(1,radio.getVolDown());
    }

}