import java.util.Scanner;

public class UsernamePassword
   {
   public static void main ( String[] args )
      {
      String keyUsername = "chronicbeard";
      int keyPassword = 12345;
      
      //create new Scanner Object
      Scanner input = new Scanner(System.in);
      //ask for username and next input is collected as a String
      System.out.println("What is the username?");
      String username  = input.next();
      //ask for password and next input is collected as an int
      System.out.println("What is the password? (integer only!)"); 
      int password = (int)input.nextInt();
      
      System.out.println("You input " + username + " as your username, " +
                        " and " + password + " as your password..." + "\n");
        
      if ( username.equals( keyUsername ) && password == keyPassword  )
         {
         System.out.println( "Successfully logged in!" );
         } // end if
      else
         {
         System.out.println( "The username and/or password does not match our records" );
         } // end else
      } // end method main
   } // end class UsernamePassword