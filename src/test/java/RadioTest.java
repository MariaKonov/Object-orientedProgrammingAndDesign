import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void turnOnTheMaximumStation() {
        Radio rad = new Radio();

        rad.currentStation = 6;

        int expected = 6;
        int actual = rad.currentStation;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToMaxStation() {
        Radio rad = new Radio();
        rad.setToMaxStation();

        int expected = 9;
        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToMinStation() {
        Radio rad = new Radio();
        rad.setToMinStation();

        int expected = 0;
        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetStationAboveMax() {
        Radio rad = new Radio();

        rad.setCurrentStation(14);

        int expected = 0;
        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void previousStationTest() {
        Radio rad = new Radio();

        rad.setCurrentStation(-1);

        int expected = 0;
        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextStationTest() {
        Radio rad = new Radio();

        rad.currentStation = 6;
        rad.nextStation();

        int expected = 7;
        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setPreviousStationTest() {
        Radio rad = new Radio();

        rad.currentStation = 6;
        rad.setPreviousStation();

        int expected = 5;
        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void turnOnTheMaximumVolume() {
        Radio rad = new Radio();

        rad.currentVolume = 6;

        int expected = 6;
        int actual = rad.currentVolume;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToMaxVolume() {
        Radio rad = new Radio();
        rad.setToMaxVolume();

        int expected = 10;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToMinVolume() {
        Radio rad = new Radio();
        rad.setToMinVolume();

        int expected = 0;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextVolumemaxTest() {
        Radio rad = new Radio();

        rad.currentVolume = 10;
        rad.nextVolumeMax();

        int expected = 10;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setPreviousVolumeminTest() {
        Radio rad = new Radio();

        rad.currentVolume = 0;
        rad.setPreviousVolumeMin();

        int expected = 0;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextVolumeTest() {
        Radio rad = new Radio();

        rad.currentVolume = 6;
        rad.nextVolume();

        int expected = 7;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setPreviousVolumeTest() {
        Radio rad = new Radio();

        rad.currentVolume = 6;
        rad.setPreviousVolume();

        int expected = 5;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
}
