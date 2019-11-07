public class ForLoops
   {
   public static void main( String[] args )
      {
      System.out.println( "x" + "\t" + "x^2" + "\t" + "Included" );
      
      for( int ctr = 1; ctr <= 10; ctr++ )
         {
         int range = ctr*ctr - ctr; // this is the range ex with 5: 25-5 = 20
         double randomNum1 = Math.random()*range; // random number from 0-20
         int randomNum2 = (int)( randomNum1 ); // cast as an int
         int ramdomNum3 = randomNum2 + ctr; // add 5 - makes 5 to 25
         // or this...
         double randomNumberInclusive = ( Math.random() * (ctr*ctr - ctr) + ctr );
         System.out.println( ctr + "\t" + ctr*ctr + "\t" + ramdomNum3 + "\t" + (int) randomNumberInclusive );
         } // end for loop
      } // end method main
   } // end class ForLoops