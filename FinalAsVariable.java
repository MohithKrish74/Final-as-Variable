package com.keyword;

class School
{
    int roll_no;
    String StudentName;
    final String SchoolName="Montessori";

}
class Student extends School
{
   public Student(int roll_no,String StudentName)
   {
       this.roll_no=roll_no;
       this.StudentName=StudentName;
       System.out.println(roll_no+" "+StudentName+" "+SchoolName);
   }
}

public class FinalAsVariable
{
    public static void main(String[] args)
    {
       // Student student = new Student(1,"Ram","Kindergarten"); The error will be thrown if we try to change the name of the School
        Student student = new Student(1,"Ram");
    }
}
