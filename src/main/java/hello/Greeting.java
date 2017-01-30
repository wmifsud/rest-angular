package hello;

/**
 * @author waylon on 30/01/2017.
 */
public class Greeting
{
    private final long id;
    private final String content;

    public Greeting()
    {
        this.id = -1;
        this.content = "";
    }

    public Greeting(long id, String content)
    {
        this.id = id;
        this.content = content;
    }

    public long getId()
    {
        return id;
    }

    public String getContent()
    {
        return content;
    }
}
