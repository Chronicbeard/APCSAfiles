public class Lab83
{
    public static void main(String[] args)
    {
        int[][] mTable = new int [11][11];
        for(int r = 0; r < mTable.length; r ++)
        {
            for(int c = 0; c < mTable.length; c ++)
            {
                if (c == 0)
                    mTable[r][c] = r;
                else if (r == 0)
                    mTable[r][c] = c;
                else
                mTable[r][c] = c*r;
                if (mTable[r][c] >=10000)
                System.out.print(mTable[r][c] + " ");
                else if (mTable[r][c] >=1000)
                System.out.print(mTable[r][c] + "  ");
                else if (mTable[r][c] >=100)
                System.out.print(mTable[r][c] + "   ");
                else if (mTable[r][c] >=10)
                System.out.print(mTable[r][c] + "    ");
                else 
                System.out.print(mTable[r][c] + "     ");
            }
            System.out.println();
        }
    }
}