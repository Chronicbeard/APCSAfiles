public class Director extends Person
{
    private int numMovies;

    public Director()
    {
        super();
        numMovies = 0;
    }

    public Director(String name, int numMovies)
    {
        super(name);
        this.numMovies = numMovies;
    }

    public String toString()
    {
        return "The director is " + super.toString() 
            + "\nAnd they have published " + numMovies + " movies";
    }
}
