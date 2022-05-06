public class Lab87
{
    public static void print(int[][] arr)
    {
         for (int r = 0; r < arr.length; r ++)
        {
            for (int c = 0; c < arr[0].length; c ++)
            {
                System.out.print(arr[r][c]);
            } 
            System.out.println();
        }
    }
    
    public static int sum(int[][] arr)
    {
        int sum = 0;
        for (int r = 0; r < arr.length; r ++)
        {
            for (int c = 0; c < arr[0].length; c ++)
            {
                sum += arr[r][c];
            } 
        }
        return sum;
    }
    
    public static int rowSum(int[][] arr, int row)
    {
       int sum = 0;
       for (int c = 0; c < arr[row].length; c ++)
       {
           sum += arr[row][c];
       }
       return sum;
    }
    
    public static int colSum(int[][] arr, int col)
    {
       int sum = 0;
       for (int r = 0; r < arr.length; r ++)
       {
           sum += arr[r][col];
       }
       return sum;
    }
    
    public static int sum2(int[][] arr)
    {
        int sum = 0;
        for (int r = 0; r < arr.length; r ++)
        {
            sum += rowSum(arr, r);
        }
        return sum;
    }
    
    public static int largest(int[][] arr)
    {
        int max = arr[0][0];
        for (int r = 0; r < arr.length; r ++)
        {
            for (int c = 0; c < arr[0].length; c ++)
            {
                if (arr[r][c] > max)
                    max = arr[r][c];
            } 
        }
        return max;
    }
    
    public static int largestByRow(int[][] arr, int row)
    {
       int max = 0;
       for (int c = 0; c < arr[row].length; c ++)
       {
           if(arr[row][c] > max)
            max = arr[row][c];
       }
       return max;
    }
    
    public static int largest2(int[][] arr)
    {
        int max = arr[0][0];
        for (int r = 0; r < arr.length; r ++)
        {
            if (largestByRow(arr, r) > max)
                max = largestByRow(arr, r);
        }
        return max;
    }
    
    public static void printTranspose(int[][] arr)
    {
        for (int c = 0; c < arr[0].length; c ++)
        {
            for (int r = 0; r < arr.length; r ++)
            {
                System.out.print(arr[r][c]);
            } 
            System.out.println();
        }
    }
}