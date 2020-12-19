import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExtendedIntegerArrayTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void CanStoreIntegers(){
        var array = new ExtendedIntegerArray(1);
        assertDoesNotThrow(() -> {
            array.setValue(0, 1);
        });
    }

    @Test
    void ThrowsOnZeroLenth(){
        assertThrows(IllegalArgumentException.class, () -> {
          new ExtendedIntegerArray(0);
        });
    }

    @Test
    void ShouldHavePositionForElements(){
        var array = new ExtendedIntegerArray(10);
        array.setValue(8, 300);
        assertEquals(300, array.getValue(8));
    }

    @Test
    void ShouldBeZeroIndexed(){
        var array = new ExtendedIntegerArray(2);
        array.setValue(0, 3);
        assertEquals(3, array.getValue(0));
    }

    @Test
    public void ShouldHaveLastPositionAsLenghtMinusOne()
    {
        var array = new ExtendedIntegerArray(10);
        array.setValue(array.getLength() - 1, 10);
        assertEquals(10, array.getValue(array.getLength() - 1));
    }

    @Test
    void ShouldThrowWhenAcceingPostionEqualToLenght()
    {
        var array = new ExtendedIntegerArray(10);
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> array.setValue(array.getLength(),11));
    }

    @Test
    public void CanCalculateSumBetweenTwoPositions()
    {
        var array = new ExtendedIntegerArray(100);

        for(int i = 0; i < 100; i++)
        {
            array.setValue(i, i+1);
        }

        assertEquals(1010, array.sumOf(39, 59));
    }
}