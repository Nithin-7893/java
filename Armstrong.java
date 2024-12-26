class Armstrong
{
public static void main(String args[])
{
int r,n=153,sum=0,temp=n;
while(n!=0)
{
r=n%10;
sum+=Math.pow(r,3);
n=n/10;
}
System.out.println((temp==sum)?"ARMSTRONG NUM":"NOT A ARMSTRONG NUM");
}
}