import net.decarufel.helloworld.Greeting;
import org.junit.Test;

import static org.junit.Assert.*;

public class MainUnitTest {

    @Test
    public void MainTest() {
        Greeting greeting = new Greeting();
        String result = greeting.Hello("World");
        assertEquals(result, "Hello World!");
    }
}
