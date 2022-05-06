import java.util.ArrayList;


public class ArrayListThing
{
    public static void main(String[] args)
    {
        ArrayList<Integer> list = new ArrayList<Integer>();
        int[] num = new int[12];
        System.out.print(num);
        for (int i = 0 ; i < 10 ; i++)
        {
            list.add(new Integer( (int) (Math.random()*100) ) );
            
        }
        System.out.println(list);
        for (int i = 0 ; i < list.size() ; i++)
        {
            System.out.println( list.remove(i) );
        }
        
        
    }
}
