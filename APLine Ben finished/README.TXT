Upgrade the APLine class to include the upgrade listed below in #1, 2, and 3 below. 

A new driver program is shown below that you can use to test your getters, setters, and 
toString() method

1.	Write getter (accessor) methods for the coefficients a, b, and c
2.	Write setter (mutator) methods for the coefficients a, b, and c.
3.	Write a toString() method to display the equation in the form:

5x + 4y + -17 = 0

or

-25x + 40y + 30 = 0


public class APLineDriver
   {
   public static void main( String[] args )
      {
      APLine line1 = new APLine( 5, 4, -17 );
      
      System.out.println( "Line 1 statistics: " );
      System.out.println( "The equation for line 1 is: " + line1 );
      
      System.out.println( "Coefficient a = " + line1.getA() );
      System.out.println( "Coefficient b = " + line1.getB() );
      System.out.println( "Coefficient c = " + line1.getC() );
      
      System.out.println( "The slope of line 1 is: " + line1.getSlope() );
      System.out.println( "Result of isOnLine: " + line1.isOnLine( 5, -2) );
   
      System.out.println( "\n" );
      
      
      APLine line2 = new APLine( 1, 1, 1 );
      line2.setA( -25 );
      line2.setB( 40 );
      line2.setC( 30 );
      
      System.out.println( "Line 2 statistics: " );
      System.out.println( "The equation for line 1 is: " + line2 );
      
      System.out.println( "Coefficient a = " + line2.getA() );
      System.out.println( "Coefficient b = " + line2.getB() );
      System.out.println( "Coefficient c = " + line2.getC() );
      
      System.out.println( "The slope of line 1 is: " + line2.getSlope() );
      System.out.println( "Result of isOnLine: " + line2.isOnLine( 5, -2) );

      } // end method main
   
       
   } // end class APLineDriver