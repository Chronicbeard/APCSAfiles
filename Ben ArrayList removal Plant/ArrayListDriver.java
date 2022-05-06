import java.util.ArrayList;

public class ArrayListDriver
{
    public static void main (String[] args )
    {
        ArrayList<String> plants = new ArrayList<String>();
        
        plants.add( new String( "Pothos" ) );
        plants.add( new String( "Spider Plant" ) );
        plants.add( new String( "Aloe" ) );
        plants.add( new String( "Aloe" ) );
        plants.add( new String( "Donky Tail" ) );
        plants.add( new String( "Aloe" ) );
        plants.add( new String( "Jade" ) );
        
        System.out.println( "Printing the plants in the ArrayList named \"plants\":\n " ); 
        for( String s : plants )
        {
            System.out.println( s );
        }
        System.out.println( "\n" );
        
        for(int i = 0 ; i < plants.size() ; i++ )
        {
            if (plants.get( i ).equals( "Aloe" ) )
            {
                plants.remove( i );
                i--;
            } // end if
        } // end for
        
        System.out.println( "Printing the plants in the ArrayList \"plants\" after removing \" Aloe \" \n " ); 
        for( String s : plants )
        {
            System.out.println( s );
        }
        
    } // end main
}
