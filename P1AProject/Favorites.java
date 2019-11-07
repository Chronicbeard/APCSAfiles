public class Favorites
{
    public static void main( String args[] )
    {
        int myFavoriteInt = 5;
        System.out.println( "Favorite integer: " + myFavoriteInt );

        double myFavoriteDouble = 2.71;
        System.out.println( "Favorite double: " + myFavoriteDouble );

        boolean myFavoriteBoolean = true;
        System.out.println( "Favorite boolean: " + myFavoriteBoolean );

        String myFavoriteMusicalGroup = "U2";
        System.out.println( "Favorite musical group: " + myFavoriteMusicalGroup );
        
        if( myFavoriteBoolean == true )
        {
            System.out.println( "it was True! " );
        } // end if
        else
        {
            System.out.println( "it was false. " );
        } // end else
    } //endmain
} // end class Favorites