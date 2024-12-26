class Bubble
{
public static void main(String args[])
{
int n=9,i,j,temp;
int array[]={3,2,5,7,6,8,9,1,4,0};
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
if(array[j]>array[j+1])
{
temp=array[j];
array[j]=array[j+1];
array[j+1]=temp;
}
}
}
System.out.println("the sorted array is:");
for(i=0;i<n;i++)
{
System.out.print(array[i]);
System.out.print("  ");
}
}
}