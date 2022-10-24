// Work in progress so far
import java.util.Scanner;

public class Grades {

    public static void main(String[] args) {
      
        int grade1;
        String value = "Your Grade was a ";
        Scanner input = new Scanner(System.in); 
      
      System.out.print("Enter points earned for your grade value: ");
        
      grade1 = input.nextInt();
      
      input.close();
        
      if (grade1 >=100)
      {
        System.out.println(value + "A+");
      }
      else if (grade1 >=90)
      {
        System.out.println(value + "A");
      }
      else if(grade1 >=80)
      {
        System.out.println(value + "B+");
      }
      else 
      {
        System.out.println("no value ");
      }
   } 
}
