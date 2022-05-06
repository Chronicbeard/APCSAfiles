public class EncryptionKey
{
   private int key;
   public EncryptionKey ( int initialKey )
   {
       // To be completed in part A
       key = initialKey;
   } // end one-arg constructor
   public int getKey()
   {
       // To be completed in part B
       return key;
   } // end method getKey
   public int numDigits()
   {
       // To be completed in part C
       String numberString = Integer.toString( Math.abs(key) );
       return numberString.length();
       // alternate
       //int temp = Math.abs(key);
       //int count = 0;
       //if( temp == 0 )
       //{
       //    count++;
       //}
       //while( temp != 0 )
       //{
       //    temp %= 10;
       //    count++;
       //}
       //return count;
   } // end method numDigits
}  // end class EncryptionKey 