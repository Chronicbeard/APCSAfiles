public class MyInteger
{
    // instance variable
    private int num;
    
    // constructor
    public MyInteger( int initNum ) 
    {
        num = initNum;
    }
    // brain method
    public int calculateSum()
    {
        int total = 0;
        String numString = Integer.toString(num);
        for( int index = 0 ; index< numString.length() ; index++ )
        {
            total += Integer.parseInt( numString.substring( index, index+1  ) );
        }
        return total;
    } // end calculateSum()
    public String toString()
    {
        return "the num is " + num;
    }
} 

/*   Chris A
 *     public int calculateSum()
    {
        int sum = 0;
        while (num > 0) 
        {
            sum = sum + num % 10;
            num = num / 10;
        }
        return sum ;
    }
 * 
 * Daniel - requires the instance variable num begins as a String.
 * 
 *     public int calcSum()
    {
        int total = 0;
        for( int i = 0; i < num.length(); i++ )
        {
            total += Integer.parseInt( Character.toString( num.charAt( i ) ) );
        }    
        return total;
    }
 * 
 * Calvin
 * 
 *     public int calculateSum()
    {
        int sum = 0;
        for (int i = 0; i < (""+num).length(); i++)
        {
            sum += (num%Math.pow(10, i+1))/Math.pow(10, i);
        }
        return sum;
    }
 * 
 * 
 * 
 * 
 * 
 * 
 */