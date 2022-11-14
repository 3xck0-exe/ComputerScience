class Main {
  public static void main(String[] args) {
  
  //Part 1 - building and filling an array object
  int [] array1 = new int [5];
  array1[0] = 4;
  array1[1] = 7;
  array1[2] = 10;
  array1[3] = 22;
  array1[4] = 3;
  System.out.println(array1[0]);
  System.out.println(array1[1]);

  //Part 1a - building a 2D array and filling it
  int [][] arrayA = new int [10][5];
  arrayA[0][0] = 4;

  //Part II - traversing an array
  for(int i = 0; i < array1.length; i++)
  {
    System.out.println(array1[i]);
  }

  //part IIa = travering a 2D array
  for(int rows = 0; rows <arrayA.length; rows++)
  {
    for(int cols = 0; cols <arrayA.length; cols++)
    {
      System.out.println(arrayA[]);
    }
  }

  //Part III -
  String [] array2 = {"dog", "cat", "bird"};
  System.out.println(array2[0]);

  for(int x = 0; x < array2.length; x++)
  {
    System.out.println(array2[x]);
  }

  //part IIIa - 2D array storing values differently
  String [] [] arrayB = {{"dog", "cat", "bird"}, 
                        {"fish", "donkey", "pony"}};

  //Part 4 - holding OBJECTS in an Array - not just primitive data
  test t1 = new test(99, "A");
  System.out.println(t1);

  test t2 = new test(44, "B");
  System.out.println(t1);

  test t3 = new test(55, "C");
  System.out.println(t1);


  test [] array3 = new test [3];
  array3[0] = t1;
  array3[1] = t2;
  array3[2] = t3;

  for(int y = 0; y < array3.length; y++)
  {
    System.out.println(array3[y]);
  }


  //building, referencing and changing array values

  int [] a = {1, 2, 3};
  int [] b;
  b = a;

  b[0] = 99;

  System.out.println(a[0]);
  System.out.println(b[0]);


  }
}
