public class StudentDriver
{
    public static void main( String[] args )
    {
        Student senior001 = new Student();
        System.out.println( "New Student Created: \n" + senior001 );
        
        Student frosh001 = new Student( "Ben", "Smith", 9, 4.0 );
        System.out.println( "New Student Created: \n" + frosh001 );
        
    } // end main method
}  // end driver