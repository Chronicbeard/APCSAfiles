public class MyIntegerDriver
{
    public static void main( String[] args )
    {
        MyInteger myNum = new MyInteger( 123456 );
        System.out.println( myNum.toString() );
        System.out.println( "The calculated sum is " + myNum.calculateSum() );
    }//end method    
}//end class  