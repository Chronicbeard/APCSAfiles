import java.util.ArrayList;

public class SuperheroDriver
   {
   public static void main( String[] args )
      {
      Superhero hero = new Superhero( "Heroman" ); 
      // add objects of superhero subclasses
      System.out.println( hero.getMotto() );
      // print mottoes and other methods.
      ArrayList<Superhero> heroes = new ArrayList<Superhero>();
      heroes.add(hero);
      //add other objects polymorphically
      
      // use a for or for each loop to run all methods.
      } // end method main
   } // end SuperheroDriver