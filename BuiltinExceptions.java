class BuiltinExceptions
{
public static void main(String args[])
{
try 
{
//int i = 5 / 0;
//String s=null;
//int t=s.length();
//System.out.println(+t);
int arr[]=null;
System.out.println(+arr[0]);
System.out.println("**REMAINING CODE IS NOT EXECUTED");
}
catch (ArithmeticException a)
{
System.out.println("ArithmeticException => " + a);
}
catch(ArrayIndexOutOfBoundsException b)
{
System.out.println("Index exception=>"+b);
}
catch(NullPointerException c)
{
System.out.println("Null pointer exception:"+c);
}
catch(Exception d)
{
System.out.println("IF ANY EXCEPTION NOT MATCHED THIS EXECUTES");
}
System.out.println("**REMAINING CODE IS EXECUTED AFTER CATCH BLOCK**");
}
}