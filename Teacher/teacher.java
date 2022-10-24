class teacher
{
    private String name;
    private int age;
    private String subject;
    private double salary;

    public teacher()
    {
        name = "Mr. Smith";
        age = 40;
        subject = "Computer Science";
        salary = 100000.00;
    }
    public teacher(String nm, int ag, String subj, double sal) //overloaded constructor
    {
        name = nm;
        age = ag;
        subject = subj;
        salary = sal;
    }
    public int getAge() //get method
    {
        return age;  //return value
    }
    public void setAge(int ag)  //set method
    {
        age = ag;  //storing data
    }
    public double getSalary() //get method
    {
        return salary; //return value
    }
    public void setSalary(double sal) //set method
    {
        salary = sal; //storing data
    }
    public String toString() //converting to string
  {
    String val = name + age + subject + salary;
    String Line = ".%n" + "%n";
    return String.format("-----------------------------------------" + "%n" + "Name: " + name + Line + "Age: " + age + Line + "Subject Of Teaching: " + subject + Line + "Monthly Salary: " + salary + Line + "-----------------------------------------");
  }
    
}
