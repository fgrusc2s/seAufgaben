package b01a01;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


/*
 * @author fgrusc2s
 */

public class HelloWorldTest {
	HelloWorld greeter = new HelloWorld();

	@Test
	public void test() {
		assertEquals("Hello World", greeter.greetings("World"));
	}
}
