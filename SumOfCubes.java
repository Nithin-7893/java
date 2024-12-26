class Cubes
{
public static void main(String args[])
{
int r,sum=0,num=123;
while(num>0)
{
r=num%10;
sum=sum+(r*r*r);
num=num/10;
}
System.out.println("sum of cubes "+sum);
}
}