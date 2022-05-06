public class EncryptionKeyDriver
   {
   public static void main( String[] args )
      {
      EncryptionKey key1 = new EncryptionKey( 1234 );
      System.out.println( "The encryption key is: " + key1.getKey() );
      System.out.println( "Number of digits in the key is: " + key1.numDigits() );
      System.out.println( "The encryption key after calling numDigits is: " + key1.getKey() + "\n\n" );

      EncryptionKey key2 = new EncryptionKey( 3 );
      System.out.println( "The encryption key is: " + key2.getKey() );
      System.out.println( "Number of digits in the key is: " + key2.numDigits() );
      System.out.println( "The encryption key after calling numDigits is: " + key2.getKey() + "\n\n" );
      
      EncryptionKey key3 = new EncryptionKey( -4543267 );
      System.out.println( "The encryption key is: " + key3.getKey() );
      System.out.println( "Number of digits in the key is: " + key3.numDigits() );
      System.out.println( "The encryption key after calling numDigits is: " + key3.getKey() + "\n\n" );

      EncryptionKey key4 = new EncryptionKey( 0 );
      System.out.println( "The encryption key is: " + key4.getKey() );
      System.out.println( "Number of digits in the key is: " + key4.numDigits() );
      System.out.println( "The encryption key after calling numDigits is: " + key4.getKey() + "\n\n" );
   
      EncryptionKey key5 = new EncryptionKey( 12 );
      System.out.println( "The encryption key is: " + key5.getKey() );
      System.out.println( "Number of digits in the key is: " + key5.numDigits() );
      System.out.println( "The encryption key after calling numDigits is: " + key5.getKey() + "\n\n" );
    
      } // end class main
      
   } // end class EncryptionKeyDriver