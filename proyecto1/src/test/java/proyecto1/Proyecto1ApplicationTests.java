package proyecto1;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.proyecto1.Proyecto1Application;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Proyecto1Application.class)
@WebAppConfiguration
public class Proyecto1ApplicationTests {

	@Test
	public void contextLoads() {
	}

}
