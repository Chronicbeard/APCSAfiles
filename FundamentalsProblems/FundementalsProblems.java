public class FundementalsProblems
{
    public static void main( String[] args ) 
    {
        boolean isTrue = true;
        int myNumber = 15;
        double myDouble = 4.0;
        String myName = new String("Ben" );
        
        System.out.println( "My boolean is " + isTrue + ", my int is " + myNumber +
                               ", my double is " + myDouble + ", my name is " + myName + "." );
        //declare and fill an array
        int[] myNumbers = new int[10];
        myNumbers[0] = 13;
        myNumbers[1] = 23;
        
        System.out.println( "the memory location for myNumbers is " + myNumbers ) ;
        //int[] myNumbers = {myNumber, 12, 56, 234543, 1, 99, 596934, 8, 9, 10};
        
        System.out.println( "my list is " + myNumbers.length + " items long." );
        for(int index = 0 ; index < myNumbers.length ; index++ )
        {
            System.out.print( myNumbers[ index ] + ", ");
        } // end for
        
        for( int index = 0 ; index < 13 ; index++ )
        {
            double randomNum = Math.random() *101;
            int randomInt = (int) randomNum;
            System.out.println( (int) ( Math.random() *101 ) + " or..." + randomInt ) ;
        } // end for
        //declare and initialze an array of ints with 4 items of my choosing
        int[] myList = { 13,456,999,1 } ;
        for( int i = 0 ; i < myList.length ; i++ )
        {
            System.out.println( "the square root of " + myList[ i ] + " is " + 
                                    Math.sqrt( myList[ i ] ) );
        }
        //Initialize an array of ints with 10 random numbers from 0-10 using a for loop. 
        int[] randomList = new int[10];
        for( int i = 0 ; i < randomList.length; i++ )
        {
            randomList[ i ] = (int) ( Math.random() *11 ) ;
            System.out.println( " the random number at index " + i + " is " +
                                        randomList[ i ] ); 
        } // end for
        // flip it, reverse it
        System.out.println( " Flip it! " );
        for( int index = randomList.length - 1 ; index >= 0 ; index-- )
        {
            System.out.println( " the random number at index " + index + " is " +
                                        randomList[ index ] ); 
            
        } // end for
        // Use a while loop to print the sum of the numbers.
        int sum = 0;
        int ctr = 0 ;
        while( ctr < randomList.length  )
        {
            sum = sum + randomList[ ctr ] ;
            ctr++;
        } // end while
        System.out.println( " the sum of the numbers in the list is: " + sum );
        for ( int i = 0; i < randomList.length ; i++)
        {
            if( randomList[ i ] > 5 )
            {
                System.out.println( randomList[ i ] + " is greater than 5." ) ;
            } // end if
            
        } // end for
    }  // End main method 
}  // end Class 