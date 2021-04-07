class Employee
{
private int  id;
private String name;
Employee(int id,String name)
{
this.id=id;
this.name=name;
}
public void display()
{
System.out.println("Employee ID No:"+id);
System.out.println("Employee Name:"+name);
}
}
class SDemo4
{
public static void main(String a[])
{
Employee e1=new Employee(123,"lucky");
Employee e2=new Employee(167,"vicky");
e1.display();
e2.display();
}
}
