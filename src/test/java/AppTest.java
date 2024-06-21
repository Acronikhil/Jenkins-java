import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AppTest {
    @Test
    public void TestMethod() {
        App a = new App();
        assertEquals("Hello, Java app is running!", a.greet());
    }

}
