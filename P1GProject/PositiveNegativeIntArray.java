public class PositiveNegativeIntArray
   {
   public static void main( String[] args )
      {
      int numbers[] = new int[10];
        // to identify the value in each cup: numbers[ index ].
      // a. populate the array with 
      for ( int index = 0; index < numbers.length; index++ )
         {
             double randomNum1 = (Math.random()*200) - 100;            
             numbers[index] = (int) ( randomNum1 );
             System.out.println( numbers[ index ] );
         } // end for loop  
      
      int index = 0;
        
      // 2. Print Values from Int Array
        
      while ( index < numbers.length )
         {    
             
             double randomNum3 = Math.random()*100;
             int randomNum4 = (int) ( randomNum3 );
  
             if ( randomNum4 < 50 )
            {
                System.out.println( "\t" + "\t" + "\t" + "\t" + "Positive number: " + numbers[index] );
            } // end if
        
         if ( randomNum4 >= 50 )
            {
            int num = numbers[index];
            num = num*-1;
            System.out.println( "Negative number: " + num );
            } // end if
        
         index++;
         } // end while loop
      } // end method main
   } // end public class 