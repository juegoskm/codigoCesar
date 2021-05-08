import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class NumbersTest {

    private Numbers numbers;

    @Before
    public void before() {
        this.numbers = new Numbers(10, 6);
    }

    @Test
    public void suma() {
        assertEquals(16, this.numbers.suma());
    }
    @Test
    public void resta() {
        assertEquals(4, this.numbers.resta());
    }
    @Test
    public void multiplicacion() {
        assertEquals(60, this.numbers.multiplicacion());
    }
}
