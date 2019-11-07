import javax.swing.JOptionPane;

public class Investment 
{
    public static void main(String[] args) 
    {
        // declare and initialize variables using jOptionPane
        int numYears = Integer.parseInt(JOptionPane.showInputDialog( "How many years of investment do you wish to project?"));
        int currentAge = Integer.parseInt(JOptionPane.showInputDialog("How old are you?"));
        double investment = Double.parseDouble(JOptionPane.showInputDialog("How much money will you invest (in dollars)"));
        double interestRate = Double.parseDouble(JOptionPane.showInputDialog("What interest rate do you think you will earn?"));
        final double INTRATE = interestRate/100;
        int currentYear = 2017;
        
        // array to hold years
        int[] years = new int[numYears];
        
        //1st for loop - fill with years
        for (int i = 0; i < numYears; i++)
        {
            years[i] = currentYear;
            currentYear++;
        }
        
        //array to hold ages
        int[] ages = new int[numYears];
        //2nd for loop
        for (int i = 0; i < numYears; i++) 
        {
            ages[i] = currentAge;
            currentAge++;
        }
        // new arrays for one time nad annual investments
        double[] oneTimeInvestment = new double[numYears];
        for (int i = 0; i < numYears; i++)
        {
            if (i == 0) 
            {
               oneTimeInvestment[i] = (investment + (INTRATE * investment));
            }
            else 
            {
               oneTimeInvestment[i] = (oneTimeInvestment[i-1] + (INTRATE * oneTimeInvestment[i-1]));
            }            
        }
        
        double[] annualInvestment = new double[numYears];
        for (int i = 0; i < numYears; i++)
        {
            if (i == 0) 
            {
                annualInvestment[i] = (investment + (INTRATE * investment));
            }
            else 
            {
               annualInvestment[i] = (annualInvestment[i-1] + investment + (INTRATE * (annualInvestment[i-1] + investment)));
            }            
        }  // end for
        System.out.println("Investment: " + investment);
        System.out.println("Rate of Return: " + (interestRate) + "%");
        System.out.println("\t \t Balance \t Balance");
        System.out.println("Year \t Age \t One Time \t Annual");
        for (int i = 0; i < numYears; i++) 
        {
            System.out.print( years[i] + "\t");
            System.out.print( ages[i] + "\t ");
            System.out.print( "$" + (double) Math.round(oneTimeInvestment[i]*100)/100 + "\t" );
            System.out.println( "$" + (double) Math.round(annualInvestment[i] *100) /100 );
        } //end for
    } //end main
}  // end class
    