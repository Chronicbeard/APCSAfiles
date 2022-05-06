public class Food
{
    private int calories;
    
    public Food()
    {
        calories = 100;   
    }
    public Food( int initCalories)
    {
        calories = initCalories;
    }
    public int getCalories()
    {
        return calories;
    } 
    public void eat()
    {
        System.out.println( "I am just eating food " );
    }
    public String toString()
    {
        return "This food has " + calories + " calories." + "\n" ;
    }
} // end food