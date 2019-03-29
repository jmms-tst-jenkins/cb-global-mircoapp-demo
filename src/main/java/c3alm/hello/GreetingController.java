package c3alm.hello;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;


/**
 * Created by n057083 on 16/10/2018.
 */

@RestController
public class GreetingController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();


    /**
     *  Dado un Nombre devuelve el Hello Nombre.
     *
     * @param name
     * @return
     */
    @CrossOrigin
    @RequestMapping(value = "/greeting" )
    public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) {

        return new Greeting(counter.incrementAndGet(),
                String.format(template, name));
    }

    /**
     *  Dado un Nombre devuelve el Hello Nombre.
     *
     * @param name
     * @return
     */
    @CrossOrigin
    @RequestMapping(value = "/greeting2" )
    public Greeting greeting2(
                @RequestParam(value="name", defaultValue="World") String name,
                @RequestParam(value="message", defaultValue="Hello") String strMessage) {

        return new Greeting(counter.incrementAndGet(),
                String.format( strMessage + ", %s!", name));
    }

}