import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SpeedyGameTest {


    @Test
    public void isGreenLightTrueSpeedNotZeroTest() {
        SpeedyGame speedyGame = new SpeedyGame(true, 2);
        int speed = 5;
        boolean expected = false;
        boolean actual = speedyGame.isFailed(speed);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void isGreenLightFalseSpeedEqualMaxSpeedTest() {
        SpeedyGame speedyGame = new SpeedyGame(false, 2);
        int speed = 2;
        boolean expected = false;
        boolean actual = speedyGame.isFailed(speed);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void isGreenLightFalseSpeedLessMaxSpeedTest() {
        SpeedyGame speedyGame = new SpeedyGame(false, 2);
        int speed = 1;
        boolean expected = false;
        boolean actual = speedyGame.isFailed(speed);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void isGreenLightFalseSpeedMoreMaxSpeedTest() {
        SpeedyGame speedyGame = new SpeedyGame(false, 2);
        int speed = 3;
        boolean expected = true;
        boolean actual = speedyGame.isFailed(speed);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void isGreenLightFalseSpeedZeroMaxSpeedZeroTest() {
        SpeedyGame speedyGame = new SpeedyGame(false, 0);
        int speed = 0;
        boolean expected = false;
        boolean actual = speedyGame.isFailed(speed);
        Assertions.assertEquals(expected, actual);
    }
}
