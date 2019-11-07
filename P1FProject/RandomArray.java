public class RandomArray
   {
   public static void main( String []args)
      {
      // initialize new array with 10 ints
      int[] nums = new int[10];
      // fill the array with 
      for ( int index = 0; index < nums.length; index++ )
         {
         //nums[index] = 1; // to test summation code
         nums[index] = (  (int)(101*Math.random()) );
         } // end for
         
      for ( int index = 0; index < nums.length; index++ )
         {
         System.out.print ( nums [index] + " ");
         } // end for
         
      int sum = 0;   
      for( int index = 0; index < nums.length; index++ )
         {
         sum = sum + nums[index];
         //sum += nums[index];
         } // end for
      System.out.println( "\nThe sum of the numbers in the array is: " + sum );
      
      for( int index = nums.length-1; index >= 0; index-- )
         {
         System.out.print( nums[index] + " " );    
         } // end for
         
      } // end main
   } // end class RandomArray
      