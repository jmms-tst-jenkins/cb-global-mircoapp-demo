package c3alm.hello;

import c3alm.hello.Greeting;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;


/**
 * Greeting Test
 * Created by n057083 on 19/10/2018.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class GreetingTest {

    /**
     *  Test Greeting
     *
      * @throws Exception
     */
    @Test
    public void contextLoads() throws Exception {
        Greeting greeting = new Greeting( 1 ,"Hello World");
        long id = greeting.getId();
        String message = greeting.getContent();

        assertThat( message.contains("Hello, World"));
        assertThat( id == 1);
    }

}
