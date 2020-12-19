import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
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

        assertDoesNotThrow(() -> {
            var array = new ExtendedIntegerArray(1);
            array.setValue(0, 1);
        });
    }

    @Test
    void ThrowsOnZeroLenth(){
        assertThrows(IndexOutOfBoundsException.class, () -> {
          new ExtendedIntegerArray(0);
        });
    }
}