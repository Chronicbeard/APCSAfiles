import java.util.Scanner;

public class StringMethods
{
    public static void main( String[] args )
    {
        System.out.println( "Practicing String methods..." );
        
        Scanner input = new Scanner( System.in );
        String statement = input.nextLine();
        
        // Zucchini
        // 01234567
        String other = new String("Zucchinj");
        
        System.out.println( " you typed: " + statement );
        System.out.println( " Length of the string " + statement.length() );
        System.out.println( " the substring(3)  " + statement.substring(3) );
        System.out.println( " the substring(3,6) " + statement.substring(3,6) );
        System.out.println( " the substring(3,8) " + statement.substring(3,8) );
        System.out.println( " indexOf " + statement.indexOf( "chiny" ) );
        System.out.println( " compare to Zucchinj " + statement.compareTo( other ));

        
        
        
    } // end main
    
} 