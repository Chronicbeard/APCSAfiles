import java.util.ArrayList;

public class FoodDriver
{
    public static void main ( String[] args )
    {
        Apples myApple = new Apples(50, "blue");
        Pie myPie = new Pie();
        Food myFood = new Food( 1000 );
        
        myApple.eat();
        myPie.eat();
        myFood.eat();
        System.out.println (myApple);
        System.out.println (myPie);
        System.out.println (myFood);
        
        ArrayList<Food> myDinner = new ArrayList<Food>();
        myDinner.add( myApple );
        myDinner.add( myPie );
        myDinner.add( myFood );
        
        int sum = 0;
        for( Food f : myDinner )
        {
            sum += f.getCalories();
        }
        System.out.println( "My dinner has " + sum + " calories." );
        
    }
    
    
}