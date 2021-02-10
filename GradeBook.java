public class GradeBook
{
   private String InstructorName; // Instructor name for this GradeBook
   private String courseName; // course name for this GradeBook

   // constructor initializes InstructorName with String argument       
   public GradeBook( String course, String name ) // constructor name is class name
   {                                                                
      InstructorName = name; // initializes InstructorName 
      courseName = course;
   } // end constructor                                             

   // method to set the Instructor name
   public void setInstructorName( String name )
   {
      InstructorName = name; // store the Instructor name
   } // end method setInstructorName

   // method to retrieve the Instructor name
   public String getInstructorName()
   {
      return InstructorName;
   } // end method getInstructorName

   // display a welcome message to the GradeBook user

    // method to set the course name
   public void setCourseName( String name )
   {
      courseName = name; // store the course name
   } // end method setCourseName

   // method to retrieve the course name
   public String getCourseName()
   {
      return courseName;
   } // end method getCourseName


   public void displayMessage()
   {
      // this statement calls getInstructorName to get the 
      // name of the Instructor this GradeBook represents
      System.out.printf("Welcome to the grade book for\n%s!", getCourseName(),"This course is presented by\n%s!\n", getInstructorName() );
   } // end method displayMessage
} // end class GradeBook