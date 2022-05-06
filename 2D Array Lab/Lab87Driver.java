public class Lab87Driver
{
    public static void main (String[] args)
    {
        int[][] mat = {{1,2,3},{4,5,6}};
        Lab87.print(mat);
        System.out.println();
        System.out.println(Lab87.sum(mat));
        System.out.println(Lab87.rowSum(mat, 0));
        System.out.println(Lab87.colSum(mat, 0));
        System.out.println(Lab87.sum2(mat));
        System.out.println(Lab87.largest(mat));
        System.out.println(Lab87.largestByRow(mat, 0));
        System.out.println(Lab87.largest2(mat));
        System.out.println();
        Lab87.printTranspose(mat);
    }
}