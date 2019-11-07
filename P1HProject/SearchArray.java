 public class SearchArray
    {
    public static void main( String[] args )
       {
       String[] artists = new String[4];
       artists[0] = "Flume";
       artists[1] = "The Chainsmokers";
       artists[2] = "Michael Jackson";
       artists[3] = "The Beatles";
       //artists[3] = null;   // This error occurs because the array
                             // consists of strings, and null is not
                             // an acceptable variable of the array.
       String key = "Michael Jackson";
        
       for ( int index = 0; index < artists.length; index++ )
          {
          if ( artists[ index ].equals( key ) )
             {
             System.out.println( "We found Michael Jackson!" );
             } // end if
          else
             {
             System.out.println( "Michael Jackson not found..." );
             } // end else
          } // end for loop
       } // end method main
    } // end class SearchArray