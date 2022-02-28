import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GameLogicTest {

    // Секция numberOfDropOutsTest <- принято сокращение numDrop

    // Секция numDropGreenLight

    @Test
    public void numDropGreenLightSpeedZeros() {
        GameLogic gameLogic = new GameLogic(true);
        gameLogic.maxSpeed = 2;
        gameLogic.listOfPlayers = new String[] {"Иван 0", "Петр 0", "Василий 0", "Олег 0", "Марьян 0"};
        int expected = 0; // ОР
        int actual = gameLogic.numbersOfDropOuts(gameLogic.listOfPlayers); //ФР
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void numDropGreenLightSpeedBelowZeros() {
        GameLogic gameLogic = new GameLogic(true);
        gameLogic.maxSpeed = 2;
        gameLogic.listOfPlayers = new String[] {"Иван -1", "Петр -2", "Василий -5", "Олег -5", "Марьян -1"};
        int expected = 0; // ОР
        int actual = gameLogic.numbersOfDropOuts(gameLogic.listOfPlayers); //ФР
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void numDropGreenLightSpeedArrayAboveZeros() {
        GameLogic gameLogic = new GameLogic(true);
        gameLogic.maxSpeed = 2;
        gameLogic.listOfPlayers = new String[] {"Иван 1", "Петр 2", "Василий 3", "Олег 4", "Марьян 55"};
        int expected = 0; // ОР
        int actual = gameLogic.numbersOfDropOuts(gameLogic.listOfPlayers); //ФР
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void numDropGreenLightSpeedArrayMixZerosNegative() {
        GameLogic gameLogic = new GameLogic(true);
        gameLogic.maxSpeed = 2;
        gameLogic.listOfPlayers = new String[] {"Иван 0", "Петр -2", "Василий -15", "Олег 0", "Марьян -55"};
        int expected = 0; // ОР
        int actual = gameLogic.numbersOfDropOuts(gameLogic.listOfPlayers); //ФР
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void numDropGreenLightSpeedArrayMixZerosPositive() {
        GameLogic gameLogic = new GameLogic(true);
        gameLogic.maxSpeed = 2;
        gameLogic.listOfPlayers = new String[] {"Иван 0", "Петр 2", "Василий 15", "Олег 0", "Марьян 55"};
        int expected = 0; // ОР
        int actual = gameLogic.numbersOfDropOuts(gameLogic.listOfPlayers); //ФР
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void numDropGreenLightSpeedArrayMixNegativePositive() {
        GameLogic gameLogic = new GameLogic(true);
        gameLogic.maxSpeed = 2;
        gameLogic.listOfPlayers = new String[] {"Иван -5", "Петр 2", "Василий -15", "Олег 6", "Марьян 55"};
        int expected = 0; // ОР
        int actual = gameLogic.numbersOfDropOuts(gameLogic.listOfPlayers); //ФР
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void numDropGreenLightSpeedArrayMixNegativePositiveZeros() {
        GameLogic gameLogic = new GameLogic(true);
        gameLogic.maxSpeed = 2;
        gameLogic.listOfPlayers = new String[] {"Иван -5", "Петр 2", "Василий 0", "Олег 6", "Марьян 55"};
        int expected = 0; // ОР
        int actual = gameLogic.numbersOfDropOuts(gameLogic.listOfPlayers); //ФР
        Assertions.assertEquals(expected, actual);
    }

    // Секция numDropRedLight

    @Test
    public void numDropRedLightArrayZeros() {
        GameLogic gameLogic = new GameLogic(false);
        gameLogic.maxSpeed = 2;
        gameLogic.listOfPlayers = new String[] {"Иван 0", "Петр 0", "Василий 0", "Олег 0", "Марьян 0"};
        int expected = 0; // ОР
        int actual = gameLogic.numbersOfDropOuts(gameLogic.listOfPlayers); //ФР
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void numDropRedLightSpeedArrayBelowZeros() {
        GameLogic gameLogic = new GameLogic(false);
        gameLogic.maxSpeed = 2;
        gameLogic.listOfPlayers = new String[] {"Иван -1", "Петр -5", "Василий -6", "Олег -1", "Марьян -1"};
        int expected = 5; // ОР
        int actual = gameLogic.numbersOfDropOuts(gameLogic.listOfPlayers); //ФР
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void numDropRedLightSpeedArrayAboveZeros() {
        GameLogic gameLogic = new GameLogic(false);
        gameLogic.maxSpeed = 2;
        gameLogic.listOfPlayers = new String[] {"Иван 1", "Петр 2", "Василий 3", "Олег 4", "Марьян 5"};
        int expected = 3; // ОР
        int actual = gameLogic.numbersOfDropOuts(gameLogic.listOfPlayers); //ФР
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void numDropRedLightSpeedArrayMixZerosNegative() {
        GameLogic gameLogic = new GameLogic(false);
        gameLogic.maxSpeed = 2;
        gameLogic.listOfPlayers = new String[] {"Иван 0", "Петр -2", "Василий 0", "Олег -4", "Марьян -5"};
        int expected = 3; // ОР
        int actual = gameLogic.numbersOfDropOuts(gameLogic.listOfPlayers); //ФР
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void numDropRedLightSpeedArrayMixZerosPositive() {
        GameLogic gameLogic = new GameLogic(false);
        gameLogic.maxSpeed = 2;
        gameLogic.listOfPlayers = new String[] {"Иван 0", "Петр 2", "Василий 0", "Олег 4", "Марьян 5"};
        int expected = 2; // ОР
        int actual = gameLogic.numbersOfDropOuts(gameLogic.listOfPlayers); //ФР
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void numDropRedLightSpeedArrayMixNegativePositive() {
        GameLogic gameLogic = new GameLogic(false);
        gameLogic.maxSpeed = 2;
        gameLogic.listOfPlayers = new String[] {"Иван -2", "Петр 2", "Василий -55", "Олег 4", "Марьян 5"};
        int expected = 4; // ОР
        int actual = gameLogic.numbersOfDropOuts(gameLogic.listOfPlayers); //ФР
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void numDropRedLightSpeedArrayMixZerosPositiveNegative() {
        GameLogic gameLogic = new GameLogic(false);
        gameLogic.maxSpeed = 2;
        gameLogic.listOfPlayers = new String[] {"Иван 0", "Петр 2", "Василий 0", "Олег -4", "Марьян 5"};
        int expected = 2; // ОР
        int actual = gameLogic.numbersOfDropOuts(gameLogic.listOfPlayers); //ФР
        Assertions.assertEquals(expected, actual);
    }

    // Секция speedOfTheDroppedPlayers <- принято сокращение speedDrop

    // Секция speedDropGreenLight

    @Test
    public void speedDropGreenLightSpeedArraySpeedZeros() {
        GameLogic gameLogic = new GameLogic(true);
        gameLogic.maxSpeed = 2;
        gameLogic.listOfPlayers = new String[] {"Иван 0", "Петр 0", "Василий 0", "Олег 0", "Марьян 0"};
        int[] expected = {}; // ОР
        int[] actual = gameLogic.speedOfTheDroppedPlayers(gameLogic.listOfPlayers); //ФР
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void speedDropGreenLightSpeedArrayBelowZeros() {
        GameLogic gameLogic = new GameLogic(true);
        gameLogic.maxSpeed = 2;
        gameLogic.listOfPlayers = new String[] {"Иван -1", "Петр -52", "Василий -4", "Олег -5", "Марьян -1"};
        int[] expected = {}; // ОР
        int[] actual = gameLogic.speedOfTheDroppedPlayers(gameLogic.listOfPlayers); //ФР
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void speedDropGreenLightSpeedArrayAboveZeros() {
        GameLogic gameLogic = new GameLogic(true);
        gameLogic.maxSpeed = 2;
        gameLogic.listOfPlayers = new String[] {"Иван 1", "Петр 52", "Василий 4", "Олег 5", "Марьян 1"};
        int[] expected = {}; // ОР
        int[] actual = gameLogic.speedOfTheDroppedPlayers(gameLogic.listOfPlayers); //ФР
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void speedDropGreenLightSpeedArrayZerosNegative() {
        GameLogic gameLogic = new GameLogic(true);
        gameLogic.maxSpeed = 2;
        gameLogic.listOfPlayers = new String[] {"Иван -1", "Петр 0", "Василий 0", "Олег -5", "Марьян -1"};
        int[] expected = {}; // ОР
        int[] actual = gameLogic.speedOfTheDroppedPlayers(gameLogic.listOfPlayers); //ФР
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void speedDropGreenLightSpeedArrayZerosPositive() {
        GameLogic gameLogic = new GameLogic(true);
        gameLogic.maxSpeed = 2;
        gameLogic.listOfPlayers = new String[] {"Иван 1", "Петр 52", "Василий 0", "Олег 0", "Марьян 1"};
        int[] expected = {}; // ОР
        int[] actual = gameLogic.speedOfTheDroppedPlayers(gameLogic.listOfPlayers); //ФР
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void speedDropGreenLightSpeedArrayNegativePositive() {
        GameLogic gameLogic = new GameLogic(true);
        gameLogic.maxSpeed = 2;
        gameLogic.listOfPlayers = new String[] {"Иван 1", "Петр 52", "Василий -4", "Олег -5", "Марьян -1"};
        int[] expected = {}; // ОР
        int[] actual = gameLogic.speedOfTheDroppedPlayers(gameLogic.listOfPlayers); //ФР
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void speedDropGreenLightSpeedArrayZerosNegativePositive() {
        GameLogic gameLogic = new GameLogic(true);
        gameLogic.maxSpeed = 2;
        gameLogic.listOfPlayers = new String[] {"Иван -1", "Петр 0", "Василий 4", "Олег -5", "Марьян 1"};
        int[] expected = {}; // ОР
        int[] actual = gameLogic.speedOfTheDroppedPlayers(gameLogic.listOfPlayers); //ФР
        Assertions.assertArrayEquals(expected, actual);
    }

    // Секция speedDropRedLight

    @Test
    public void speedDropRedLightSpeedArrayZeros() {
        GameLogic gameLogic = new GameLogic(false);
        gameLogic.maxSpeed = 2;
        gameLogic.listOfPlayers = new String[] {"Иван 0", "Петр 0", "Василий 0", "Олег 0", "Марьян 0"};
        int[] expected = {}; // ОР
        int[] actual = gameLogic.speedOfTheDroppedPlayers(gameLogic.listOfPlayers); //ФР
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void speedDropRedLightSpeedArrayBelowZeros() {
        GameLogic gameLogic = new GameLogic(false);
        gameLogic.maxSpeed = 2;
        gameLogic.listOfPlayers = new String[] {"Иван -1", "Петр -5", "Василий -4", "Олег -51", "Марьян -1"};
        int[] expected = {-1, -5,-4,-51,-1}; // ОР
        int[] actual = gameLogic.speedOfTheDroppedPlayers(gameLogic.listOfPlayers); //ФР
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void speedDropRedLightSpeedArrayAboveZeros() {
        GameLogic gameLogic = new GameLogic(false);
        gameLogic.maxSpeed = 2;
        gameLogic.listOfPlayers = new String[] {"Иван 1", "Петр 13", "Василий 4", "Олег 51", "Марьян 125"};
        int[] expected = {13, 4, 51, 125}; // ОР
        int[] actual = gameLogic.speedOfTheDroppedPlayers(gameLogic.listOfPlayers); //ФР
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void speedDropRedLightSpeedArrayZerosNegative() {
        GameLogic gameLogic = new GameLogic(false);
        gameLogic.maxSpeed = 2;
        gameLogic.listOfPlayers = new String[] {"Иван -1", "Петр 0", "Василий 0", "Олег -51", "Марьян -1"};
        int[] expected = {-1, -51, -1}; // ОР
        int[] actual = gameLogic.speedOfTheDroppedPlayers(gameLogic.listOfPlayers); //ФР
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void speedDropRedLightSpeedArrayZerosPositive() {
        GameLogic gameLogic = new GameLogic(false);
        gameLogic.maxSpeed = 2;
        gameLogic.listOfPlayers = new String[] {"Иван 1", "Петр 0", "Василий 4", "Олег 51", "Марьян 0"};
        int[] expected = {4, 51}; // ОР
        int[] actual = gameLogic.speedOfTheDroppedPlayers(gameLogic.listOfPlayers); //ФР
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void speedDropRedLightSpeedArrayPositiveNegative() {
        GameLogic gameLogic = new GameLogic(false);
        gameLogic.maxSpeed = 2;
        gameLogic.listOfPlayers = new String[] {"Иван 1", "Петр 51", "Василий -4", "Олег -51", "Марьян -1"};
        int[] expected = {51, -4, -51, -1}; // ОР
        int[] actual = gameLogic.speedOfTheDroppedPlayers(gameLogic.listOfPlayers); //ФР
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void speedDropRedLightSpeedArrayZerosNegativePositive() {
        GameLogic gameLogic = new GameLogic(false);
        gameLogic.maxSpeed = 2;
        gameLogic.listOfPlayers = new String[] {"Иван -1", "Петр 0", "Василий 2", "Олег 51", "Марьян -1"};
        int[] expected = {-1, 51, -1}; // ОР
        int[] actual = gameLogic.speedOfTheDroppedPlayers(gameLogic.listOfPlayers); //ФР
        Assertions.assertArrayEquals(expected, actual);
    }

    // Секция speedOfTheNonDroppedPlayers <- принято сокращение speedNonDrop

    // Секция speedNonDropGreenLight

    @Test
    public void speedNonDropGreenLightSpeedArrayZeros() {
        GameLogic gameLogic = new GameLogic(true);
        gameLogic.maxSpeed = 2;
        gameLogic.listOfPlayers = new String[] {"Иван 0", "Петр 0", "Василий 0", "Олег 0", "Марьян 0"};
        int[] expected = {0, 0, 0, 0, 0}; // ОР
        int[] actual = gameLogic.speedOfTheNonDroppedPlayers(gameLogic.listOfPlayers); //ФР
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void speedNonDropGreenLightSpeedArrayBelowZeros() {
        GameLogic gameLogic = new GameLogic(true);
        gameLogic.maxSpeed = 2;
        gameLogic.listOfPlayers = new String[] {"Иван -1", "Петр -5", "Василий -85", "Олег -7", "Марьян -75"};
        int[] expected = {}; // ОР
        int[] actual = gameLogic.speedOfTheNonDroppedPlayers(gameLogic.listOfPlayers); //ФР
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void speedNonDropGreenLightSpeedArrayAboveZeros() {
        GameLogic gameLogic = new GameLogic(true);
        gameLogic.maxSpeed = 2;
        gameLogic.listOfPlayers = new String[] {"Иван 1", "Петр 5", "Василий 85", "Олег 7", "Марьян 75"};
        int[] expected = {1, 5, 85, 7, 75}; // ОР
        int[] actual = gameLogic.speedOfTheNonDroppedPlayers(gameLogic.listOfPlayers); //ФР
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void speedNonDropGreenLightSpeedArrayZerosNegative() {
        GameLogic gameLogic = new GameLogic(true);
        gameLogic.maxSpeed = 2;
        gameLogic.listOfPlayers = new String[] {"Иван 0", "Петр -5", "Василий -85", "Олег 0", "Марьян -75"};
        int[] expected = {0, 0}; // ОР
        int[] actual = gameLogic.speedOfTheNonDroppedPlayers(gameLogic.listOfPlayers); //ФР
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void speedNonDropGreenLightSpeedArrayZerosPositive() {
        GameLogic gameLogic = new GameLogic(true);
        gameLogic.maxSpeed = 2;
        gameLogic.listOfPlayers = new String[] {"Иван 0", "Петр 5", "Василий 85", "Олег 0", "Марьян 75"};
        int[] expected = {0, 5, 85, 0, 75}; // ОР
        int[] actual = gameLogic.speedOfTheNonDroppedPlayers(gameLogic.listOfPlayers); //ФР
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void speedNonDropGreenLightSpeedArrayPositiveNegative() {
        GameLogic gameLogic = new GameLogic(true);
        gameLogic.maxSpeed = 2;
        gameLogic.listOfPlayers = new String[] {"Иван -5", "Петр 5", "Василий 85", "Олег -78", "Марьян 75"};
        int[] expected = {5, 85, 75}; // ОР
        int[] actual = gameLogic.speedOfTheNonDroppedPlayers(gameLogic.listOfPlayers); //ФР
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void speedNonDropGreenLightSpeedArrayZerosPositiveNegative() {
        GameLogic gameLogic = new GameLogic(true);
        gameLogic.maxSpeed = 2;
        gameLogic.listOfPlayers = new String[] {"Иван 0", "Петр 5", "Василий 0", "Олег -78", "Марьян 75"};
        int[] expected = {0, 5, 0, 75}; // ОР
        int[] actual = gameLogic.speedOfTheNonDroppedPlayers(gameLogic.listOfPlayers); //ФР
        Assertions.assertArrayEquals(expected, actual);
    }

    // Секция speedNonDropRedLight

    @Test
    public void speedNonDropRedLightSpeedArrayZeros() {
        GameLogic gameLogic = new GameLogic(false);
        gameLogic.maxSpeed = 2;
        gameLogic.listOfPlayers = new String[] {"Иван 0", "Петр 0", "Василий 0", "Олег 0", "Марьян 0"};
        int[] expected = {0, 0, 0, 0, 0}; // ОР
        int[] actual = gameLogic.speedOfTheNonDroppedPlayers(gameLogic.listOfPlayers); //ФР
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void speedNonDropRedLightSpeedArrayBelowZeros() {
        GameLogic gameLogic = new GameLogic(false);
        gameLogic.maxSpeed = 2;
        gameLogic.listOfPlayers = new String[] {"Иван -1", "Петр -5", "Василий -85", "Олег -7", "Марьян -75"};
        int[] expected = {}; // ОР
        int[] actual = gameLogic.speedOfTheNonDroppedPlayers(gameLogic.listOfPlayers); //ФР
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void speedNonDropRedLightSpeedArrayAboveZeros() {
        GameLogic gameLogic = new GameLogic(false);
        gameLogic.maxSpeed = 2;
        gameLogic.listOfPlayers = new String[] {"Иван 1", "Петр 5", "Василий 85", "Олег 7", "Марьян 75"};
        int[] expected = {1}; // ОР
        int[] actual = gameLogic.speedOfTheNonDroppedPlayers(gameLogic.listOfPlayers); //ФР
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void speedNonDropRedLightSpeedArrayZerosNegative() {
        GameLogic gameLogic = new GameLogic(false);
        gameLogic.maxSpeed = 2;
        gameLogic.listOfPlayers = new String[] {"Иван 0", "Петр 0", "Василий -85", "Олег -8", "Марьян -75"};
        int[] expected = {0, 0}; // ОР
        int[] actual = gameLogic.speedOfTheNonDroppedPlayers(gameLogic.listOfPlayers); //ФР
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void speedNonDropRedLightSpeedArrayZerosPositive() {
        GameLogic gameLogic = new GameLogic(false);
        gameLogic.maxSpeed = 2;
        gameLogic.listOfPlayers = new String[] {"Иван 0", "Петр 2", "Василий 85", "Олег 0", "Марьян 75"};
        int[] expected = {0, 2, 0}; // ОР
        int[] actual = gameLogic.speedOfTheNonDroppedPlayers(gameLogic.listOfPlayers); //ФР
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void speedNonDropRedLightSpeedArrayPositiveNegative() {
        GameLogic gameLogic = new GameLogic(false);
        gameLogic.maxSpeed = 2;
        gameLogic.listOfPlayers = new String[] {"Иван 5", "Петр 2", "Василий 85", "Олег -78", "Марьян 75"};
        int[] expected = {2}; // ОР
        int[] actual = gameLogic.speedOfTheNonDroppedPlayers(gameLogic.listOfPlayers); //ФР
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void speedNonDropRedLightSpeedArrayZerosPositiveNegative() {
        GameLogic gameLogic = new GameLogic(false);
        gameLogic.maxSpeed = 2;
        gameLogic.listOfPlayers = new String[] {"Иван 0", "Петр 1", "Василий 0", "Олег -78", "Марьян 75"};
        int[] expected = {0, 1, 0}; // ОР
        int[] actual = gameLogic.speedOfTheNonDroppedPlayers(gameLogic.listOfPlayers); //ФР
        Assertions.assertArrayEquals(expected, actual);
    }


    // Секция соответствия массивов имен выживших
    @Test
    public void trueNameTest () {
        GameLogic gameLogic = new GameLogic(false);
        gameLogic.maxSpeed = 2;
        gameLogic.listOfPlayers = new String[] {"Петр 1", "Оксана -5", "Валерий 0", "Гавриил 57"};
        String[] expected = {"Петр", "Валерий"};
        String[] actual = gameLogic.listOfSurvivors(gameLogic.listOfPlayers);
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void oneNameTest () {
        GameLogic gameLogic = new GameLogic(false);
        gameLogic.maxSpeed = 2;
        gameLogic.listOfPlayers = new String[] {"Петр 1"};
        String[] expected = {"Петр"};
        String[] actual = gameLogic.listOfSurvivors(gameLogic.listOfPlayers);
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void nameWithSymbolTest () {
        GameLogic gameLogic = new GameLogic(false);
        gameLogic.maxSpeed = 2;
        gameLogic.listOfPlayers = new String[] {"Петр! 1", "Илья№ 5"};
        String[] expected = {"Петр!"};
        String[] actual = gameLogic.listOfSurvivors(gameLogic.listOfPlayers);
        Assertions.assertArrayEquals(expected, actual);
    }
}
