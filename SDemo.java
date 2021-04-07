class Student
{
private int regno;
private String name;
Student(int regno,String name)
{
this.regno=regno;
this.name=name;
}
public void display()
{
System.out.println("Register No:"+regno);
System.out.println("Name:"+name);
}
}
class SDemo
{
public static void main(String a[])
{
Student s1=new Student(101,"Arun");
Student s2=new Student(102,"Balu");
s1.display();s2.display();
}
}