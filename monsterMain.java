class monsterMain {
  public static void main(String[] args) {
    monster m1 = new monster(); // uses default / building monster
    System.out.println(m1);     //printing monster
    monster m2 = new monster(true, 8, "spider"); //uses overloaded
    System.out.println(m2);
    System.out.println(m2.getEyes()); //gets the amount of eyes of monster 2 and prints it with system out print line.
  }
}
