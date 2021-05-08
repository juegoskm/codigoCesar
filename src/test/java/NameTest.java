import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class NameTest {
    private Name name;
    @Before
    public void before(){
        this.name = new Name("Cesar");
    }
    @Test
    public void methodRetornar(){
        assertEquals(5,this.name.methodRetornar() );
    }
    @Test
    public void methodRevez(){
        assertEquals("raseC",this.name.methodRevez());
    }
}
