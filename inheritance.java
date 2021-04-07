class student
{
private String studenttype;
private String labname;
public student(String studenttype,String labname)
{
this.studenttype=studenttype;
this.labname=labname;
}
void display()
{
System.out.println("studenttype is:"+studenttype);
System.out.println("labname is:"+labname);
}
}
class college extends student
{
public college(String studenttype,String labname)
{
super (studenttype,labname);
}
}
class inheritance
{
public static void main(String a[])
{
student s1=new college("science student","practicals");
student s2=new college("art student","project");
s1.display();
s2.display();
}
}
