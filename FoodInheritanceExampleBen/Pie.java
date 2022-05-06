public class Pie extends Food
{
    private int slices;
    public Pie()
    {
        // calls parent constructor
        super();
        slices = 6;
    }
    public Pie( int initCalories , int initSlices )
    {
        // calls parent constructor with parameter
        super( initCalories );
        slices = initSlices;
    }
    public void eat()
    {
        // calls parent eat() method then adds to it.
        super.eat();
        System.out.println( "(and it is pie.)" );
    }
    public double caloriesPerSlice()
    {
        // method using parent method getCalories()
        return super.getCalories() / slices;
    }
    public String toString()
    {
        return super.toString() + "  It is Pie and it has " 
               + slices + " slices" + "\n";
    }
}   