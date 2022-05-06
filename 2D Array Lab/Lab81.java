public class Lab81
{
    public static void main(String[] args)
    {
        int[][] rando = new int [3][4];
        for(int r = 0; r < rando.length; r ++)
        {
            for(int c = 0; c < rando[0].length; c ++)
            {
                rando[r][c] = (int)((Math.random() * 10));
            }
        }
        for(int r = 0; r < rando.length; r ++)
        {
            for(int c = 0; c < rando[0].length; c ++)
            {
                System.out.print(rando[r][c] + "\t");
            }
            System.out.println();
        }
        for(int r = 0; r < rando.length; r ++)
        {
            for(int c = 0; c < rando[0].length; c ++)
            {
                if(rando[r][c] == 5)
                    System.out.println("There is a 5 at row: " + r + " and column: " + c);
            }
        }
    }
}