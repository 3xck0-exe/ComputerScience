//  Created by Sp1d3rH3X 

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

class vendingMachine {


    public static void main(String[] args)
    {
      // Scanner for inputint user value
        Scanner input = new Scanner(System.in);
      // Currency
        double Dollars = 1.00;
        double Quarters = 0.25;
        double Dimes = 0.10;
        double Nickles = 0.05; 
      // Items and there pricing
        double Skittles = 2.00;
        double Doritos = 1.50;
        double RPBC = 2.00;
        double Snickers = 1.50;
        double popTarts = 2.00;
        double granolaBar = 1.50;
        double cheeseIts = 0.50;
        double chexMix = 3.25;
        double Pretzels = 1.50;
        double waterBottle = 1.50;
        double monsterEnergy =  2.75;
        double coffeeMilk = 3.00;
        double strawberryMilk = 3.00;
        double strabberryLemonade = 2.50;
        double secretItem = 9000.00;


            slowPrint("...01001000 01100101 01101100 01101100 01101111 00111111");
        System.out.println("");
        try{
        Thread.sleep(1000);
        }catch(InterruptedException ex){
        }
        slowPrint("Sorry about that. ");
        try{
        Thread.sleep(1000);
        }catch(InterruptedException ex){
        }
        slowPrint("Seems like my creator forgot to turn my language compiler on.");
        System.out.println("");
        try{
        Thread.sleep(1000);
        }catch(InterruptedException ex){
        }
        slowPrint("Anyways. ");
        slowPrint("Here are the selections provided.");
        System.out.println("");
        System.out.println("-------------------------------------------------------------------");
        System.out.println("1 : Skittles - $2.00 \n2 : Doritos - $1.50 \n3 : Reese's Peanut Butter Cups - $2.00 \n4 : Snickers Bar - $1.50 \n5 : Pop-Tarts - $2.00 \n6 : Granola Bar - $1.50 \n7 : Cheeze-its - $0.50 \n8 : Chex Mix - $3.25 \n9 : Pretzels - $1.50 \n10 : Water bottle - $1.50 \n11 : Monster Energy - $2.75 \n12 : Coffee Milk - $3.00 \n13 : Strawberry Milk - $3.00 \n14 : Strawberry Lemonade - $2.50 \n15 : Secret Item - $9000.00 \n16 : Quit");
        System.out.println("-------------------------------------------------------------------");
        System.out.print("Enter In The Ammount Of Dollars You Have, If You Don't Have Dollars Type 0 -> : ");
        int Dollars1 = input.nextInt(); 
        System.out.println("Enter In The Ammount Of Quarters You Have, If You Don't Have Dollars Type 0 -> : ");
        int Quarters1 = input.nextInt();
        System.out.println("Enter In The Ammount Of Dimes You Have, If You Don't Have Dimes Type 0 -> : ");
        int Dimes1 = input.nextInt();
        System.out.println("Enter In The Ammount Of Nickles You Have, If You Don't Have Nickles Type 0 -> : ");
        int Nickles1 = input.nextInt();
        double Total1 = Dollars * Dollars1; 
        double Total2 = Quarters * Quarters1;
        double Total3 = Dimes * Dimes1;
        double Total4 = Nickles * Nickles1; 
        double amount = Total1 + Total2 + Total3 + Total4;
        
        slowPrint("You have - $" +  amount + ". Please type your selection here word for word -> : ");
        String choice = input.nextLine().toLowerCase();
        
          if(choice == "skittles"){
          slowPrint("Vending Skittles... ");
          amount = amount - Skittles;
        } else if(choice == "doritos"){
          slowPrint("Vending Doritos... ");
          amount = amount - Doritos;
        } else if(choice == "reese's peanut butter cups"){
          slowPrint("Vending Reese's Peanut Butter Cups... ");
          amount = amount - RPBC;
        } else if(choice == "snickers bar"){
          slowPrint("Vending Snickers Bar... ");
          amount = amount - Snickers;
        } else if(choice == "pop-tarts"){
          slowPrint("Vending Pop-Tarts... ");
          amount = amount - popTarts;
        } else if(choice == "granola bar"){
          slowPrint("Vending Granola Bar... ");
          amount = amount - granolaBar;
        } else if(choice == "cheese-its"){
          slowPrint("Vending Cheese-Its... ");
          amount = amount - cheeseIts; 
        } else if(choice == "chex mix"){
          slowPrint("Vending Chex Mix... ");
          amount = amount - chexMix;
        } else if(choice == "pretzels"){
          slowPrint("Vending Pretzels... ");
          amount = amount - Pretzels;
        } else if(choice == "water bottle"){
          slowPrint("Vending Water Bottle... ");
          amount = amount - waterBottle;
        } else if(choice == "monster energy"){
          slowPrint("Vending Monster Energy... ");
          amount = amount - monsterEnergy;
        } else if(choice == "coffee milk"){
          slowPrint("Vending Coffee Milk... ");
          amount = amount - coffeeMilk;
        } else if(choice == "strawberry milk"){
          slowPrint("Vending Strawberry Milk... ");
          amount = amount - strawberryMilk;
        } else if(choice == "strawberry lemonade"){
          slowPrint("Vending Strawberry Lemonade... ");
          amount = amount - strabberryLemonade;
        } else if(choice == "secret item"){
          slowPrint("Vending Secret Item... ");
          amount = amount - secretItem;
        } else if(choice == "quit"){
          slowPrint("Thank you for using the vender bender machine...goodbye. ");
          
        } 

        
//Make a fucntion where you take in information and whatever that number is, add it to the ammount of money
// for etc input = 3, make the input ammount add to dollars or quarters etc and that adds the amount of money we have
//so 3 + dollars = 3.00 or 3 + quarters == 0.75
      }
    
  public static void slowPrint(String output) { //creating slowPrint object 
    for (int i = 0; i<output.length(); i++) {
      char c = output.charAt(i);
      System.out.print(c);
      try {
        TimeUnit.MILLISECONDS.sleep(50);
      }
      catch (Exception e) {

        }
      }
   }
  }

/*Soda Machine

-Process
Add money (quarters, dimes, nickels, dollars = balance)
Prompt the user (for each type of “money”)
Total it into balance

Choose a product
Assign a number to a product
-If (product to number)
Conditions we have to check:
	-if we balance > or = product
	-else if stock > or = desired amount
-dispense - or 
	-not enough balance
	-not enough stock

In instance we have stock && balance
-dispense
-subtract from balance
	-give change


Functions/Methods

-What to dispense
Take an input (String) - A1, B1
Compare the user input to the machines inventory
Count if (anything is left)
Enough money
Dispense the item
Give the change


-Know the cost of the item // Enough money to dispense the item
Establish cost (double)
Compare that cost against the “balance”

-How much money it’s taking in
Variables (double) - Quarters, Dimes, Nickels, Dollars, 

-How much to return
MATH! (adding & subtracting - from a balance (double))

 */
