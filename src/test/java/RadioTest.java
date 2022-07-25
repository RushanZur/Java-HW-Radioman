import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    @Test
    public void setMoreMaximum() {
        Radio voise = new Radio();
        voise.setMaxVolume(11);

        assertEquals(0, voise.getMaxVolume());
    }

    @Test
    public void setMoreMinimum() {
        Radio voise = new Radio();
        voise.setMinVolume(0);
        assertEquals(9, voise.getMinVolume());
    }

    @Test
    public void instalStation() {
        Radio voise = new Radio();
        voise.setStatNumber(5);
        assertEquals(5, voise.getStatNumber());
    }

    @Test
    public void regulateVolumeMax() {
        Radio volume = new Radio();
        volume.setVolUp(11);
        assertEquals(1, volume.getVolUp());
    }

    @Test
    public void regulateVolumeMin() {
        Radio volume = new Radio();
        volume.setVolDown(0);
        assertEquals(10, volume.getVolDown());
    }
}