interface shape
{
public abstract void display();
}
class Circle implements shape
{
public void display()
{
System.out.println("Circle");
}
}
class Rectangle implements shape
{
public void display()
{
System.out.println("Rectangle");
}
}
class Square implements shape
{
public void display()
{
System.out.println("Square");
}
}
class IDemo1
{
public static void main(String a[])
{
shape s1=new Circle();
shape s2=new Rectangle();
shape s3=new Square();
s1.display();
s2.display();
s3.display();
}
}
