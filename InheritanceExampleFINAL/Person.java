public class Person
{
    // instance variables - replace the example below with your own
    private String name;

    public Person()
    {
        name = "no name";
    }

    public Person(String name)
    {
        this.name = name;
    }

    public String toString()
    {
        return "named " + name;
    }
}
