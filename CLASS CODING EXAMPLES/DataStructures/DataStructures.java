import java.util.List;
import java.util.ArrayList;

public class DataStructures
{
     public static void main (String[] args)
     {
          // arrays - basics
          // make new arrays with three types of data
          int[] nums = {1,4,8,3,5,4,9,8,2,0};
          double[] dubs = new double[5];
          dubs[0] = 3.0 / 4.0;
          dubs[1] = 3.142;
          dubs[2] = 20;
          dubs[3] = 'A' ;
          dubs[4] = Math.sqrt(13);
          String[] names = {"Bill", "Bob", "Jim", "Jane"};
          
          //Tasks
          // 1) search nums and print the index of the number 5
          
          for( int i = 0 ; i < nums.length ; i ++ )
          {
              if( nums[i] == 5) System.out.println( "the index of 5 is: " + i );
          }
          // 2) find and print the average of nums
          int count = 0;
          for( int i = 0 ; i < nums.length ; i ++ )
          {
              count+=nums[i];
          }
          System.out.println( "the average is: " + (double) count / nums.length );
          // 3) print each of the calculated values in dubs on the same line, comma separated.
          for( int i = 0 ; i < dubs.length-1 ; i++ )
          {
              System.out.print( dubs[i] + ", " );
          }
          System.out.println( dubs[dubs.length-1] + "." );
          // 4) Change each of the String values in names to include the last name "Doe"
          for( int i = 0 ; i < names.length ; i++ )
          {
              names[i] += " Doe";
          }
          // 5) Print the updated names list in reverse on separate lines
          System.out.println( "The names list is: " );
          for( int i = names.length-1 ; i >=0 ; i-- )
          {
              
              System.out.println( names[i] );
          }          
          // ArrayList:
          List<String> colors = new ArrayList<String>();
          colors.add(new String("red"));
          colors.add(new String("yellow"));
          colors.add(new String("blue"));
          colors.add(1, new String("orange"));
          colors.set(0, new String("indigo"));
          colors.add(0, new String("violet"));
          // V, I , O, Y, B
          colors.add(0, new String("red"));
          colors.remove(1);
          colors.remove(1);
          colors.add(3, "green" );
          colors.add("indigo");
          colors.add("violet");
          
          
          for (int i = 0 ; i < colors.size() ; i++)
          {
              System.out.println( colors.get(i) );
          }
          List<String> list1 = new ArrayList<String>();
          list1.add("a");
          list1.add("b");
          list1.add(0,"c");
          list1.add(1, "d");
          list1.set(2, "e");
          list1.add("f");
          System.out.println(list1);
          
     }
}
