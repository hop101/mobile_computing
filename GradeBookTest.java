public class GradeBookTest
{
   // main method begins program execution
   public static void main( String[] args )
   { 
      // create GradeBook object
      GradeBook gradeBook1 = new GradeBook(         
         "CS101 Introduction to Java Programming"," Xiaoming Lu" );
      GradeBook gradeBook2 = new GradeBook(         
         "CS102 Data Structures in Java","Lewin Bram" );         

    System.out.printf( "gradeBook1 course name is: %s\n",gradeBook2.getCourseName() );
    System.out.printf( "gradeBook2 Instructor name is: %s\n",gradeBook2.getInstructorName() );

    gradeBook1.setCourseName("Introduction to DataStructures");
    gradeBook1.setInstructorName("Priya Kandula");

    System.out.printf( "gradeBook1 course name is: %s\n",gradeBook1.getCourseName() );
    System.out.printf( "gradeBook2 Instructor name is: %s\n",gradeBook1.getInstructorName() );

    System.out.printf( "gradeBook1 course name is: %s\n",gradeBook2.getCourseName() );
    System.out.printf( "gradeBook2 Instructor name is: %s\n",gradeBook2.getInstructorName() );
    

   } // end main
} // end class GradeBookTest