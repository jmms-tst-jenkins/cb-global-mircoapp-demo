package c3alm.hello;

/**
 * Created by n057083 on 16/10/2018.
 */
public class Greeting {

    private final long id;
    private final String content;

    /*
        Constructor por defecto
        content: Mensaje que devolverá
     */
    public Greeting(long id, String content) {
        this.id = id;
        this.content = content;;
    }

    public Greeting(long id,  String content, String strSaludo ) {
        this.id = id;
        this.content = content;
    }

    /**
     *  Devuelve el identificador del mensaje
     *
     * @return identificador del mensaje
     */
    public long getId() {
        return id;
    }

    /**
     *  Devuelve el mensaje de SAludo
     *
     * @return
     */
    public String getContent() {
        return content;
    }


}
