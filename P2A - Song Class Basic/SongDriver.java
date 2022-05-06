public class SongDriver
{
    public static void main( String[] args )
    {
        Song wakeUpSong = new Song();
        System.out.println( "Wake up song is: \n" + wakeUpSong );
        
        Song goToSleepSong = new Song( 3.34, "wooHoo", " Styx" );
        System.out.println( "Go to sleep song is: \n" + goToSleepSong );
        
        System.out.println( " the song length is: " + wakeUpSong.getSongLength() );
    } // end main method
}  // end driver