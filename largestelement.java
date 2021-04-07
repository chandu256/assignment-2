class largestarray
{
public static void main(String a[])
{
int array[]=new int []{67,89,54,34,7};
int max=array[0];
for(int i=0;i<array.length;i++)
{
if(array[i]>max)
max=array[i];
}
System.out.println("Largest element present in given array:"+max);
}
}