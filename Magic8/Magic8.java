//  Creator / Sp1d3rH3X
import java.util.Scanner;


class Magic8 {     
    
    public int shake;             
    Scanner input = new Scanner(System.in);      
    
  public Magic8() {      
    System.out.println("You see a magic 8 ball and are mesmorized by its design");
    try{
    Thread.sleep(2000);  //2000ms = 2s
    
    }catch(InterruptedException ex){
    }
    
    System.out.print("What do you ask the Magic 8 ball? : ");
    
    String answer = input.nextLine();
  
  }
    public void shake() 
    {  
      shake = (int)(1+Math.random()*20);
      if (shake == 1){
        System.out.println("It is certain.");
      }
      else if(shake == 2){
        System.out.println("Without a doubt.");
      }
      else if(shake == 3){
        System.out.println("Yes definitely.");
      }
      else if(shake == 4){
        System.out.println("You may rely on it.");
      }
      else if(shake == 5){
        System.out.println("It is decidedly so");
      }
      else if(shake == 6){
        System.out.println("As I see it, yes.");
      }
      else if(shake == 7){
        System.out.println("Most likely.");
      }
      else if(shake == 8){
        System.out.println("Outlook good.");
      }
      else if(shake == 9){
        System.out.println("Yes.");
      }
      else if(shake == 10){
        System.out.println("Signs point to yes.");
      }
      else if(shake == 11){
        System.out.println("Reply hazy, try again.");
      }
      else if(shake == 12){
        System.out.println("Ask again later.");
      }
      else if(shake == 13){
        System.out.println("Better not tell you now.");
      }
      else if(shake == 14){
        System.out.println("Cannot predict now.");
      }
      else if(shake == 15){
        System.out.println("Concentrate and ask again.");
      }
      else if(shake == 16){
        System.out.println("Don't count on it.");
      }
      else if(shake == 17){
        System.out.println("My reply is no.");
      }
      else if(shake == 18){
        System.out.println("My sources say no.");
      }
      else if(shake == 19){
        System.out.println("Outlook not so good.");
      }
      else if(shake == 20){
        System.out.println("Very doubtful.");
      }
      else{
        System.out.println("Man how tf do you think I know this?");
        }
    }
  }
