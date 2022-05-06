/**
 * Complete at least the first 4 methods below. Test them in the main method
 * Try the Challenges too!
 *
 * @author Ben Smith
 * @version (2/2021)
 */
public class ArrayAlgorithms
{
    /**
     * Average method to calculate an average
     * @ param int[] array of int values.
     * @return double average of int values in the array.
     */
    public static double average(int[] arr)
    { 
        double sum = 0;
        for( int num : arr )
        {
            sum+=num;
        }
        return sum/arr.length;
    }
    public static double minimum(double[] arr)
    {
        double min = arr[0];
        for( double num: arr)
        {
            if(num < min)
            {
                min = num;
            }
        }
        return min;
    }
    public static PotatoHead[] hasMoustache(PotatoHead[] taters)
    {
        PotatoHead[] staches = new PotatoHead[taters.length];
        int index = 0;
        for( PotatoHead tater: taters)
        {
            if(tater.getHasMoustache() )
            {
                // put it in staches...
                staches[index] = tater;
                index++;
            }
        }
        return staches;
    }
    
    
    
    
    /**
     * Write the following methods:
     * public static double minimum(double[] arr)
     *      to find minimum value in an array
     *     
     * public static boolean findString(String[] words, String target)
     *      Search for a particular string in an array of strings
     * public static PotatoHead[] hasMoustache(PotatoHead[] taters)
     *      returns an array of Potatoheads from the original array
     *      that have moustaches. see Potatohead class in the project.
     * public static String bigRect(Rectangle[] rects)
     *      given an array of Rectangle objects, finds the one with the
     *      largest area, and returns the toString() for that rectangle.
     * CHALLENGES: optional
     * public static boolean hasDuplicates(int[] arr)
     *      Determine the presence or absence of duplicate elements in an int[]
     * public static int numPotatoesWithArms(PotatoHead[] potatoes, int numArms)
     *      Determine the number of elements meeting specific criteria
     *      in this case, number of potatoheads in an array with a 
     *      specified number of arms.
     * public static void shiftLeft( int[] arr )
     *      Shift elements in an int[] to the left
     *      placing the elelment in index 0 to last index.
     *      alter the original array, do not return a new one.
     * public static void reverse( rectangle[] rects )
     *      Reverse the order of the elements in the array.
     */
    public static void main(String[] args)
    {
        // setup the arrays
        int[] nums = {1,6,8,3,4,2,3, 9, 13, 56};
        // double array
        // String array
        // PotatoHead Array (at least 5 different PotatoHead objects)
        // Rectangle Array (at least 5 different Rectangle objects)
        
        // call and test the methods: Be aware of their return methods (or not)
        System.out.println( " the average method: " + average( nums) );
        // minimum(double[] arr)
        // findString(String[] words, String target)
        // hasMoustache(PotatoHead[] taters)
        // bigRect(Rectangle[] rects)
        
        
        // CHALLENGES:
        // hasDuplicates(int[] arr)
        // numPotatoesWithArms(PotatoHead[] potatoes, int numArms)
        // shiftLeft( int[] arr )
        // reverse( rectangle[] rects )
    }

}
