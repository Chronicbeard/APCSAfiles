public class Song
{
    // initialize instance variables
    private static int songNumber;
    private double songLength;
    private String songTitle;
    private String songArtist;
    // zero argument constructor with null or default values
    public Song()
    {
        songNumber++;
        songLength = 0.0;
        songTitle = new String( "No Title" );
        songArtist = new String( "No Artist" );
    }  // end zero arg constructor
    // three argument constructor
    public Song(double initialSongLength, String initialSongTitle, String initialSongArtist)
    {
        songNumber++;
        songLength = initialSongLength;
        songTitle = new String( initialSongTitle );
        songArtist = new String( initialSongArtist );
    }  // end three argument constructor
    
    public double getSongLength()
    {
        return songLength;
    } // end getter
    
    public String toString()
    {
        return ("Song Length is: " + songLength + "\n" +
                "Song title is: " + songTitle + "\n" +
                "Song artist is: " + songArtist +
                "\nTotal number of songs: " + songNumber);
    } // ends toString() 
    
}  // End Song class.  