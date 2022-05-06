// include these as the first lines of your program
//   to allow you to use the ArrayList object

import java.util.List;
import java.util.ArrayList;    


public class SongArray
{
    public static void main( String[] args )
    {
        ArrayList<String> songs = new ArrayList<String>();
        songs.add( "gryffin" );
        songs.add( "telomere" );
        songs.add( "Grungy" );
        songs.add( "extrication" );
        System.out.println( " the length of the ArrayList is " + songs.size() );
        
        for( int index = 0 ; index < songs.size() ; index++ )
        {
            System.out.println( songs.get( index ) );
        }
        
        
        songs.remove( 0 ) ;
        System.out.println( "\n\n" + "Now removed" );
        for( int index = 0 ; index < songs.size() ; index++ )
        {
            System.out.println( songs.get( index ) );
        }
        
        songs.add( new String("hello" ) );
        System.out.println( "\n\n" + "Now added" );
        for( int index = 0 ; index < songs.size() ; index++ )
        {
            System.out.println( songs.get( index ) );
        }        
    }
}