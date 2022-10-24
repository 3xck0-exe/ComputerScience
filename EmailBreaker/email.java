import java.util.Scanner;
import java.util.concurrent.TimeUnit;
public class email        //Making the class email                       
  
{
  private String email;  //private String variable of email

   public email(String e)  //public String variable of email assigned e
   {
   email = e;  //email is being assigned into e
   }
   
   public void emailBreaker()  //new method
   {
     Scanner input = new Scanner(System.in);
     slowPrint("please enter in your email. ");
     try{
    Thread.sleep(1000);
    }catch(InterruptedException ex){
    }
     System.out.println();
     slowPrint("For example : Username@gmail.com. ");
     try{
    Thread.sleep(2000);
    }catch(InterruptedException ex){
    }
     System.out.println();
     System.out.print("Enter in your email as provided: ");
     String email = input.nextLine();
   int indexofAT = email.indexOf('@');  //finding the index "number" assigned to the @ symbol
   int indexofDOT = email.indexOf('.',indexofAT);  // finding the int number of the . after indexofAT number
   System.out.println("Username: " + email.substring(0, indexofAT)); //starting from 0 and ending at @ which will only print out the array from before this statement
   System.out.println("Server: " + email.substring(indexofAT+1, indexofDOT));   //starts from @ and gives +1 so its from the right of it and ends at indexofDOT so printing the array before this
   System.out.println("Domain: " + email.substring(indexofDOT+1));
   }  // prints after the indexofDOT with +1 so you can get the domain

public static void slowPrint(String output) { //creating slowPrint object 
    for (int i = 0; i<output.length(); i++) {
      char c = output.charAt(i);
      System.out.print(c);
      try {
        TimeUnit.MILLISECONDS.sleep(80);
      }
      catch (Exception e) {
      }
    }
  }
}
