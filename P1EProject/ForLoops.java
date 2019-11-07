public class ForLoops
   {
   public static void main( String[] args )
      {
      String name = new String( "Computer Science" );
      // print out the String
      System.out.println( name );
      // print out the String length
      System.out.println( name.length() );
        
      //1. Create a 1D Array
      String[] movies = new String[3];
        
      //2. Populating 1D Array
      movies[0] = new String( "The Martian " );
      movies[1] = new String( "Fast & Furious 7 " );
      movies[2] = new String( "Jurassic World " );
        
       System.out.println( movies.length );
        
      //3. Printing Array Contents
      for (int index = 0; index < movies.length; index++)
         {
         System.out.println( "movie # " + (i+1) + "is " + movies[index] );
         } // end for loop
        
      String[] songs = new String[3];
      songs[0] = new String( "One Dance " );
      songs[1] = new String( "Never Be Like You " );
      songs[2] = new String( "Roses " );
        
      //4. Printing using a while loop
      int index = 0;
      while (index < songs.length)
         {
         System.out.print( songs[index] + "\t" );
         index++;
         }// end while loop
      } // end method main
   } // end class ForLoops