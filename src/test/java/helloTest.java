import org.junit.Assert;
import org.junit.Test;

import hello.Greeter;

public class helloTest {

    Greeter greeter = new Greeter();

    @Test
    public void testLength() {
        Assert.assertEquals(26, greeter.sayHello().length());
    }

    @Test
    public void testHex() {
        String expected = "Hello world! Jabed Bangali";
        Assert.assertEquals(expected, greeter.sayHello());
    }

}
