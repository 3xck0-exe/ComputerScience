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
