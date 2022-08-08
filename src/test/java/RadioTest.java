import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {
    Radio radio = new Radio();

    @Test
    public void increaseVolumeMoreMax() {
        radio.setVolume(500);
        radio.increaseVolume();
        assertEquals(0, radio.getVolume());
    }

    @Test
    void increaseVolume() {
        radio.setVolume(5);
        radio.increaseVolume();
        assertEquals(6, radio.getVolume());
    }

    @Test
    void increaseVolumeMin() {
        radio.setVolume(0);
        radio.increaseVolume();
        assertEquals(1, radio.getVolume());
    }

    @Test
    void decreaseVolumeMoreMax() {
        radio.setVolume(106);
        radio.decreaseVolume();
        assertEquals(105, radio.getVolume());
    }

    @Test
    void decreaseVolume() {
        radio.setVolume(0);
        radio.decreaseVolume();
        assertEquals(100, radio.getVolume());
    }

    @Test
    void decreaseVolumeMax() {
        radio.setVolume(-1);
        radio.decreaseVolume();
        assertEquals(100, radio.getVolume());

    }

    @Test
    void nextNumberStationlowMin() {
        radio.setNumberStation(-5);
        radio.nextNumberStation();
        assertEquals(1, radio.getNumberStation());
        assertEquals(0, radio.getMinNumberStation());
    }

    @Test
    void nextNumberStationMoreMax() {
        radio.setNumberStation(50);
        radio.nextNumberStation();
        assertEquals(1, radio.getNumberStation());
        assertEquals(10, radio.getMaxNumberStation());
    }

    @Test
    void nextNumberStationMax() {
        radio.setNumberStation(10);
        radio.nextNumberStation();
        assertEquals(0, radio.getNumberStation());
        assertEquals(10, radio.getMaxNumberStation());
    }

    @Test
    void numberStationMin() {
        radio.setNumberStation(0);
        radio.setMinNumberStation(0);
        assertEquals(0, radio.getMinNumberStation());
    }

    @Test
    void numberStationMax() {
        radio.setNumberStation(10);
        radio.setMaxNumberStation(10);
        assertEquals(10, radio.getMaxNumberStation());
    }

    @Test
    void prevNumberStationLowMin() {
        radio.setNumberStation(-5);
        radio.setMinNumberStation(0);
        assertEquals(0, radio.getNumberStation());
        assertEquals(0, radio.getMinNumberStation());
    }

    @Test
    void nextNumberStationLowMin() {
        radio.setNumberStation(-20);
        radio.setMinNumberStation(0);
        assertEquals(0, radio.getMinNumberStation());
    }

    @Test
    void setNumberStation() {
        radio.setNumberStation(5);
        radio.setNumberStation(15);
        assertEquals(5, radio.getNumberStation());
    }

    @Test
    void setMinNumberStation() {
        radio.setMinNumberStation(0);
        radio.setMinNumberStation(0);
        assertEquals(0, radio.getMinNumberStation());
    }

    @Test
    void setMaxNumberStation() {
        radio.setMaxNumberStation(10);
        assertEquals(10, radio.getMaxNumberStation());
    }

    @Test
    void nextNumberStation() {
        radio.setNumberStation(3);
        radio.nextNumberStation();
        assertEquals(4, radio.getNumberStation());
    }

    @Test
    void prevNumberStation() {
        radio.setNumberStation(6);
        radio.prevNumberStation();
        assertEquals(5, radio.getNumberStation());
    }

}