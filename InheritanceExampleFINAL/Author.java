
public class Author extends Person
{
    private int numBooks;

    public Author()
    {
        // initialise instance variables
        super();
        numBooks = 0;
    }

    public Author(String name, int numBooks)
    {
        super(name);
        this.numBooks = numBooks;
    }

    public String toString()
    {
        return "The author is " + super.toString() 
            + "\nAnd they have published " + numBooks + " books";
    }
}
