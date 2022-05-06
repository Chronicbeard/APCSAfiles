public class Student
{
    // initialize instance variables
    // upgrade
    private String first;
    private String last;
    private int grade;
    private double[] grades;
    // zero argument constructor with null or default values
    public Student()
    {
        first = new String( "empty" );
        last = new String( "empty" );
        grade = 0;
        grades = new double[5];
        grades[0] = 0.0;
        grades[1] = 0.0;
        grades[2] = 0.0;
        grades[3] = 0.0;
        grades[4] = 0.0;
    }  // end zero arg constructor
    // three argument constructor
    public Student(String initialFirst, String initialLast, 
                    int initialGrade, double initEnglish, double initMath,
                    double initScience, double initFineArts, double initSocialScience)
    {
        first = new String( initialFirst );
        last = new String( initialLast );
        grade = initialGrade;
        
        
        grades = new double[5];
        grades[0] = initEnglish;
        grades[1] = initMath;
        grades[2] = initScience;
        grades[3] = initFineArts;
        grades[4] = initSocialScience;
        
    }  // end three argument constructor
    // name getters
    public String getFirstName()
    {
      return first;    
    } // end method getFirstName
      
    public String getLastName()
    {
      return last;    
    } // end method getFirstName
    // public method calcGPA()
    // initialize a sum
    
    public double calcGPA( )
    {
        double calcGPA = 0;
        for( int index = 0 ; index< grades.length ; index++)
        {
            calcGPA = calcGPA + grades[index];
        }
        calcGPA /= grades.length;
        return calcGPA;
    }
    // getter()
    public double getMathGPA()
    {
        return grades[ 1 ] ; 
    } // end getter

    public void setMathGPA( double newMathGPA )
    {
        grades [ 1 ] = newMathGPA;
    } // end getter
    
    // toString() method
    public String toString()
    {
        String output = new String();
        output = "Student Information: \n" + 
                "First Name: " + first + "\n" +
                "Last name: " + last + "\n" +
                "Grade: " + grade + "\n" +
                "cumulative GPA: " + calcGPA();
        return output;
        
    } // ends toString() 
    
}  // End Song class.  