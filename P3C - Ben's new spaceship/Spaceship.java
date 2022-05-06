import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Spaceship extends Actor
   {
   private String name;
   private double speed; 
   private double xDestination;
   private double yDestination;
   
   
   public Spaceship(  )
      {
      name = null;
      speed = 0.0;
      } // end two-argument constructor

   public Spaceship( String initialName, double initialSpeed )
      {
      name = new String (initialName);
      speed = initialSpeed;
      } // end two-argument constructor
        
   public void act()
      {
      if ( !isAtEdge() )
         {
         move( 10 );
         turn( 2 );
         } // end if
      else
         {
         turn(180);
         move(10);
         } // end else
      getWorld().showText( "Distance to destination is: " + calcTripDistance() + 
      " km", getWorld().getWidth()/2, getWorld().getHeight() - 100 );
      getWorld().showText( "Time to destination is: " + calcTripTime() +
      " sec", getWorld().getWidth()/2, getWorld().getHeight() - 50 );
      }// end act()
   // brain method calcTripDistance
   public double calcTripDistance()
   {
       double xCalc = ( xDestination - getX() ) * ( xDestination - getX() );
       double yCalc = ( yDestination - getY() ) * ( yDestination - getY() );
       return Math.sqrt( xCalc + yCalc );
   } // end calcTripDistance
   // brain method calcTripTime
   public double calcTripTime()
   {
       return calcTripDistance() / speed;
    } // end calc trip time
   public String toString()
      {
      String output = new String();
      output = "Name of ship is: " + name  + "\n" + " Speed is: " + 
                speed + "\n" + " X coordinate is: " + getX()   + 
               " Y coordinate is: " + getY();
      return output;
      } // end method toString()   
    
  } // end class Spaceship
