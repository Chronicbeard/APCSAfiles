
/**
 * A book is an item that has an author, inherits title and publication 
 * date from Item
 *
 */
public class Book extends Item
{
    // instance variables - replace the example below with your own
    private Author writer;

    /**
     * Constructor for objects of class Book
     */
    public Book()
    {
        // initialise instance variables
        super();
        writer = new Author();
    }

    public Book( String title, int date, Author a)
    {
        super(title, date);
        this.writer = a;
    }

    public String toString()
    {
        return "The book is titled: \"" + super.getTitle() 
            + "\"\nThe publication date is: " 
            + super.getPubDate() + "\n" + writer.toString();
    }
}
