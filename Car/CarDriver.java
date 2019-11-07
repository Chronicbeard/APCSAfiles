public class CarDriver
{
    public static void main( String[] args )
    {
        Car myCar1 = new Car();
        Car myCar2 = new Car(true, 100000, "Ford");
        
        System.out.println( myCar1 );
        System.out.println( myCar2 );
    
    } // end main method
} // end class Driver 