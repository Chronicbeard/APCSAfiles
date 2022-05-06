import java.util.*;
public class grid
{
    private int[][] nums;
    
    public grid(int r, int c)
    {
        // initialise instance variables
        nums= new int[r][c];
        int n=0;
        for (int row=0; row<r; row++)
        {
            for (int col=0; col<c; col++)
            {
                nums[row][col]=++n;
            }
        }
    }

    public String toString()
    {
        String result = "";
        int grandTotal=0;
        for (int row=0; row<nums.length; row++)
        {
            result+= "\n" ;
            for (int col=0; col<nums[row].length; col++)
            {result+= "\t" +nums[row][col]; grandTotal+=nums[row][col];}
        }
        return result + "\nGrand total is "+grandTotal;
    }
    
    public void rowTotals()
    {
        for (int row=0; row<nums.length; row++)
        {
            int sum=0;
            for (int col=0; col<nums[row].length; col++)
            {
                sum+=nums[row][col];
            }
            System.out.println("Row "+row+" total is "+sum);
        }
    }
    
    public void columnTotals()
    {
       for (int col=0; col<nums[0].length; col++)
        {
            int sum=0;
            for (int row=0; row<nums.length; row++)
            {
                sum+=nums[row][col];
            }
            System.out.println("Column "+col+" total is "+sum);
        }
    }
    
    public static void main(String[] args)
    {
        grid myGrid = new grid(3,5);
        System.out.println(myGrid+"\n");
        myGrid.rowTotals();
        myGrid.columnTotals();

    }
}
