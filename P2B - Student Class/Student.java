public class Student
{
    // initialize instance variables
    // upgrade
    private String first;
    private String last;
    private int grade;
    private double gpa;
    // zero argument constructor with null or default values
    public Student()
    {
        first = new String( "null" );
        last = new String( "null" );
        grade = 0;
        gpa = 0.0;
    }  // end zero arg constructor
    // three argument constructor
    public Student(String initialFirst, String initialLast, 
                    int initialGrade, double initialGpa)
    {
        first = new String( initialFirst );
        last = new String( initialLast );
        grade = initialGrade;
        gpa = initialGpa;
    }  // end three argument constructor
    // toString() method
    public String toString()
    {
        String output = new String();
        output = "Student Information: \n" + 
                "First Name: " + first + "\n" +
                "Last name: " + last + "\n" +
                "Grade: " + grade + "\n" +
                "GPA: " + gpa;
        return output;
        
    } // ends toString() 
    
}  // End Song class.  