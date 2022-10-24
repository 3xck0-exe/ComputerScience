/* Rock Paper Scissors

THE CONSTRUCTOR:
Play rock paper scissors
Rock paper scissors shoot


// Player 1
Generate random number based around 1-3 -- (int)(1+Math.random()*3)
Store the random number 9int rand1 = (int)(1+Math.random()*3)

Connect a number to a rock, paper, or scissors

if random number 1 == Rock
(if rand1 = 1)
System.out.print("Player 1 picks Rock")

// Player 2
Generate random number based around 1-3 -- (int)(1+Math.random()*3)
Store the random number 9int rand1 = (int)(1+Math.random()*3)

Connect a number to a rock, paper, or scissors

if random number 2 == Paper
(if rand2 = 2)
System.out.print("Player 2 picks Paper")


- 2 players (options)
- shake their hand for a 3 count

- Option: 1 Rock (set rock to number 1)
  Paper covers rock (lose)
  Rock to rock (tie)
  Rock breaks scissors (win)

- Option: 2 Paper (set paper to number 2)
  Paper covers rock (win)
  Paper to paper (tie)
  Scissors cuts paper (lose)

- Option 3 Scissors (set scissors to number 3)
  Scissors cut paper (win)
  Scissors to scissors (tie)
  Rock to scissors (lose)

- Best of 3
- Store a "score"
- Best of 3 games

Class: RPS

Constructor: "The Game" - RPS

Objects we create: RPS

- If statements */
import java.util.Scanner;
import java.util.concurrent.TimeUnit; //addition of a utility that slow's down text speed making it more robotic of a game.


class Main {
  
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);


     //making a while statement for when the code is running
    slowPrint("Welcome user ^w^"); //slowPrint allows the words to come out slow
        try{
    Thread.sleep(1000); //stops code for 1 second
    }catch(InterruptedException ex){
    }
    System.out.println();
    
    slowPrint("My name is rocko the robot -w-");
        try{
    Thread.sleep(1000);
    }catch(InterruptedException ex){
    }
    System.out.println();
    
    slowPrint("Lets play a game of rock paper scissor shoot *w*");
     try{
    Thread.sleep(500); 
    }catch(InterruptedException ex){
    }
    System.out.println();
    int player = 0;
    int robot = 0;
    int o = 0;
    while(o < 3){
      
    slowPrint("Choose from the selection provided: ");
    System.out.println();
    System.out.println("Rock");
    System.out.println("Paper");
    System.out.println("Scissors");
    System.out.println("Quit");
    String choice = input.nextLine().toLowerCase(); //taking input and changing the value to lowercase
    
      if(choice.equals("quit")) {
        System.out.println("Goodbye <3"); 
        break; //adding a false value where it stops the code if user types quit
      }
   
    if(choice.equals("rock") && choice.equals("paper") && choice.equals("scissors")) {
    System.out.println("NO CHEATING!!!");
    } else {
                // Randomly generate a value of 3 options
      int rand = (int)(Math.random() * 3);
    String opponentMove = "";
    if(rand == 0) {
    opponentMove = "rock";
    } else if(rand == 1) {
    opponentMove = "paper";
    } else {
    opponentMove = "scissors";
    }
    slowPrint("Interesting move, I choose: " + opponentMove);
        try{
    Thread.sleep(1000);
    }catch(InterruptedException ex){
    }
    System.out.println();
      
    if(choice.equals(opponentMove)){
    slowPrint("We tied @w@ silly me.");
      o = o - 1;
      
    } else if(choice.equals("rock") && (opponentMove.equals("paper"))){
      slowPrint("You lose, sorry bud :P paper beats rock.");
      robot = robot + 1;
      System.out.println("");
      try{
    Thread.sleep(1000);
    }catch(InterruptedException ex){
    }
    } else if(choice.equals("paper") && (opponentMove.equals("rock"))){
      slowPrint("You win, darnit that's not fair.");
      player = player + 1;
      System.out.println("");
      try{
    Thread.sleep(1000);
    }catch(InterruptedException ex){
    }
    } else if(choice.equals("scissors") && (opponentMove.equals("rock"))){
        slowPrint("You lose, sorry bud :P rock beats scissors, how do you not know that? It's common physics.");
      robot = robot + 1;
      System.out.println("");
      try{
    Thread.sleep(1000);
    }catch(InterruptedException ex){
    }
    } else if(choice.equals("rock") && (opponentMove.equals("scissors"))){
        slowPrint("You win, damnit how could I be such a fool >w<.");
      player = player + 1;
      System.out.println("");
      try{
    Thread.sleep(1000);
    }catch(InterruptedException ex){
    }
    } else if(choice.equals("scissors") && (opponentMove.equals("paper"))){
        slowPrint("You win, and what a fresh cut it was."); 
      player = player + 1;
      System.out.println("");
      try{
    Thread.sleep(1000);
    }catch(InterruptedException ex){
    }
    } else if(choice.equals("paper") && (opponentMove.equals("scissors"))){
        slowPrint("You lose, this was just too easy -W-."); 
      robot = robot + 1;
      System.out.println("");
      try{
    Thread.sleep(1000);
    }catch(InterruptedException ex){
    }
      }
     if (player == 1 && robot == 0){
       slowPrint("lets go best out of 3!");
     }else if(robot == 1 && player == 0){
        slowPrint("we can go best out of 3, make it easy for ya.");
       System.out.println("");
       try{
    Thread.sleep(1000);
    }catch(InterruptedException ex){
    }
     }else if(player == 1 && robot == 1){
        slowPrint("Looks like were on even playing feilds, lets see who will win"); 
       System.out.println("");
       try{
    Thread.sleep(1000);
    }catch(InterruptedException ex){
    }
     }else if(player == 2 && robot == 0){
        slowPrint(":'( I don't like this game anymore.");
       System.out.println("");
       try{
    Thread.sleep(1000);
    }catch(InterruptedException ex){
    }
     }else if(robot == 2 && player == 0){
        slowPrint("Good game loser $w$.");
       System.out.println("");
       try{
    Thread.sleep(1000);
    }catch(InterruptedException ex){
    }
       }
    } 
      try{
    Thread.sleep(1000);
    }catch(InterruptedException ex){
    }
System.out.println("");  System.out.println("--------------------------------------------------------");
    if (robot == 2){
      break;
    } else if (player == 2){
      break;
    } else  
    o = o + 1;
    }
  }

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
