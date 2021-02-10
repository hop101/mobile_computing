import java.util.Scanner;
class Circle
{
   static Scanner sc = new Scanner(System.in);
   public static void main(String args[])
   {
      System.out.print("Enter the radius: ");
      double radius = sc.nextDouble();
    
      System.out.println("The area of circle is:" + (2 * radius));

      System.out.println("The area of circle is:" +  Math.PI * (radius * radius));
    
      System.out.println( "The circumference of the circle is:"+Math.PI * 2*radius) ;
   }
}