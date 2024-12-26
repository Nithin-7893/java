class Constructor
{
int x,y;
Constructor
{
x=0;
y=0;
}
Constructor(int a)
{
x=a;
}
Constructor(int a,int b)
{
x=a;
y=b;
}
void display()
{
System.out.printf("x=%d\y=%d",x,y);
}
}
class Consta
{
public static void main(String args[])
{
Constructor c=new Constructor();
Constructor p=new Constructor(5);
Constructor q=new Constructor(4,5);
c.print();
p.print();
q.print();
}
}
								
