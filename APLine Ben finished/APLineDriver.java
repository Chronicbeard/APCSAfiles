public class APLineDriver
   {
   public static void main( String[] args )
      {
      APLine line1 = new APLine( 5, 4, -17 );
      
      System.out.println( "Line 1 statistics: " );
      System.out.println( "The slope of line 1 is: " + line1.getSlope() );
      System.out.println( "Result of isOnLine: " + line1.isOnLine( 5, -2) );
   
      System.out.println( "\n" );
      
      
      APLine line2 = new APLine( -25, 40, 30 );
      System.out.println( "The slope of line 1 is: " + line2.getSlope() );
      System.out.println( "Result of isOnLine: " + line2.isOnLine( 5, -2) );

      } // end method main
   
       
   } // end class APLineDriver