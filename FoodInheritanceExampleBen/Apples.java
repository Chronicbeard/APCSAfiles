public class Apples extends Food
{
    private String color;
    public Apples()
    {
        // calls the constructor from parent class
        super(); 
        color = "green";
    }

    public Apples( int initCalories, String initColor )
    {
        // calls the constructor with parameter from parent
        super( initCalories );
        color = initColor;
    }

    public void eat()
    {
        System.out.println( "Yum, I am eating an apple, and it is " + color );
    }

    public String toString()
    {
        // Method Overload - combine the parent toString() and new one for child
        return super.toString() + " It is an apple and it is " + color + "\n" ;
    }
}  // end Apples 