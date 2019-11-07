public class EvenOdd
   {
   public static void main( String[] args )
      {
      double random = Math.random()*100;
      int random2 = (int) (random);

      System.out.println( "Number is " + random2 );

      if (random2 % 2 == 0)
         {
         System.out.println( "Your number is even" );
         } // end if
      else
         {
         System.out.println( "Your number is odd" ); 
         } // end else
      } // end method main
   } // end class EvenOdd