
public class runner
{
    public static void main(String[] args)
    {
        Store s = new Store();
        Author a = new Author();
        Author ibram = new Author("Ibram X Kendi",5);
        Director d = new Director();
        Director spike = new Director("Spike Lee", 129);
        Book b = new Book();
        Book b2 = new Book("How to be an Antiracist", 2019, ibram);
        Movie m = new Movie();
        Movie m2 = new Movie("Do the Right Thing", 1990, spike);
        Person p = new Person();
        Item i = new Item("unknown", 2022);
        s.addItem( b );
        s.addItem( b2 );
        s.addItem( m );
        s.addItem( m2 );
        s.addItem( i );
        

        System.out.println( s );
    }
}
