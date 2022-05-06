
public class multiplicationGrid
{
    public static void main(String[] args)
    {   
     int[][] grid = new int[13][13];
        int i=0;
        for (int row=0; row<grid.length; row++)
        {
            for (int col=0; col<grid[0].length; col++)
            {
                if (row==0)
                {
                    grid[row][col] = col;
                 }
                else if (col==0)
                {
                    grid[row][col]=row;
                }
                else
                {
                    grid[row][col] = grid[row][0]*grid[0][col];
                }
                
                System.out.print(grid[row][col]+"\t");
            }
            System.out.println();
        }
    }
}