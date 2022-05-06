public class Lab82
{
    public static void main(String[] args)
    {
        int[][] nums = new int [3][5];
        int counter = 1;
        for(int r = 0; r < nums.length; r ++)
        {
            for(int c = 0; c < nums[0].length; c ++)
            {
                nums[r][c] = counter;
                counter++;
            }
        }
        for(int[] row: nums)
        {
            for(int value: row)
            {
                System.out.print(value + "\t");
            }
            System.out.println();
        }
        int sumTotal = 0;
        int sumRow = 0;
        int sumCol = 0;
        for(int r = 0; r < nums.length; r ++)
        {
            for(int c = 0; c < nums[0].length; c ++)
            {
                sumTotal =+ nums[r][c];
                sumRow += nums[r][c];
            }
            System.out.println("Row number " + r + " sum is " + sumRow);
            sumRow = 0;
        }
        for(int c = 0; c < nums[0].length; c ++)
        {
            for(int r = 0; r < nums.length; r ++)
            {
                sumCol += nums[r][c];
            }
            System.out.println("Column number " + c + " sum is " + sumCol);
            sumCol = 0;
        }
        System.out.println("The sum of the array is " + sumTotal);
    }
}