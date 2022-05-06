public class StudentDriver
{
    public static void main( String[] args )
    {
        Student senior001 = new Student();
        System.out.println( "New Student Created (senior001): \n" + senior001 );
        
        Student frosh001 = new Student( "Ben", "Smith", 9 , 3.0, 3.0, 3.5, 4.0, 4.0 );
        System.out.println( "New Student Created (frosh001): \n" + frosh001 );
        frosh001.setMathGPA( 4.0 );
        System.out.println( "The Math grade is now: " + frosh001.getMathGPA() ) ;
        System.out.println( "The Brain method calcGPA() is: " + frosh001.calcGPA() ) ;
        System.out.println( "New Student updated: \n" + frosh001 );
    } // end main method
}  // end driver