class count
{
public static void main(String a[])
{
try{
int count=0,num=7654;
while(num!=0){
//num=num/10
num /=10;
++count;
}
}
System.out.println("Number of digits:"+count);
}
}