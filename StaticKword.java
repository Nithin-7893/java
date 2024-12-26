class Staticdemo 
{
static int a=10;
static int b;
static
{
System.out.println("in st block");
b=a*4;
}
void display()
{
System.out.println("a="+a);
System.out.println("b="+b);
}
public static void main(String args[])
{
Staticdemo d=new Staticdemo();
d.display();
System.out.println("a*b="+(a*b));
}
}