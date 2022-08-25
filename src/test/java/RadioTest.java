import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    Radio radio = new Radio();
    @Test
    void nextStation() {
        Radio radio = new Radio();
        radio.setNumberStation(3);
        radio.increaseStation();
        assertEquals(4, radio.getNumberStation());

    }

    @Test
    void nextStationMore() {
        Radio radio = new Radio();
        radio.setNumberStation(10);
        assertEquals(0,radio.getNumberStation());
    }

    @Test
    void previousStation() {
        Radio radio = new Radio();
        radio.setNumberStation(6);
        radio.decreaseStation();
        assertEquals(5, radio.getNumberStation());
    }
    @Test
    void previousStationMore() {
        Radio radio = new Radio();
        radio.setNumberStation(-3);
        assertEquals(9, radio.getNumberStation());
    }
    @Test
    void increaseVolume () {
        Radio radio = new Radio();
        radio.setVolume(7);
        radio.increaseVolume();
        assertEquals(8, radio.getVolume());
    }
    @Test
    void increaseVolumeMore () {
        Radio radio = new Radio();
        radio.setVolume(11);
        assertEquals(10, radio.getVolume());
    }

    @Test
    void decreaseVolume () {
        Radio radio = new Radio();
        radio.setVolume(4);
        radio.decreaseVolume();
        assertEquals(3, radio.getVolume());
    }
    @Test
    void decreaseVolumeMore () {
        Radio radio = new Radio();
        radio.setVolume(-1);
        assertEquals(0, radio.getVolume());
    }
}