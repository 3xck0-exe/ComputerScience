class Main {
  public static void main(String[] args) {
    monster m1 = new monster(); // uses default / building monster
    System.out.println(m1);     //printing monster
    monster m2 = new monster(true, 8, "spider"); //uses overloaded
    System.out.println(m2);
    System.out.println(m2.getEyes()); //gets the amount of eyes of monster 2 and prints it with system out print line.
  }
}
  
class monster     //class heading
{
  private boolean haveEyes;     //instance variable/data members
  private int numEyes;
  private String name;

  public monster()     //default constructor
  {
    haveEyes = true;
      numEyes = 6;
    name = "spl1c3r";
  }
  public monster(boolean he, int nE, String n)  //overloaded constructor
  {
    haveEyes = he;
    numEyes = nE;
    name = n;
  }
  public int getEyes()    //get method / accessor method 
  {
    return numEyes;
  }

  public void setEyes(int nE)   //set method / modifier method
  {
    numEyes = nE;
  }

  public String toString()     //to string method / converts into string
  {
    String a = name + " " + haveEyes + " " + numEyes;
    return a;
  }
  
}