public class Quadratic
{
    public static void main( String[] args )
    {
        int a = 2;
        int b = 10;
        int c = 3;
        
        System.out.println( "The value of b*b is: " + b*b );
        System.out.println( "The value of 4*a*c is: " + 4*a*c );
        System.out.println( "The value of the squre root of b*b-4*a*c is: " + Math.sqrt( (b*b) - (4*a*c) ) );
        //print first descriminant
        double firstRoot = -b + (Math.sqrt( (b*b) - (4*a*c) ) / 2*a ) ;
        double secondRoot = -b - (Math.sqrt( (b*b) - (4*a*c) ) / 2*a ) ;
        double desc = (b*b) - (4*a*c) / 2*a ;
        if (desc < 0 )
        {
            System.out.println( "Your descriminant is negative. Try again." );
        }// end if
        else
        {
            System.out.println( "The value of the first root is: " + firstRoot ) ;                            
            System.out.println( "The value of the second root is: " + secondRoot ) ;
        } //end else
        
                                   
    } // end main method
}  // end class Quadratic