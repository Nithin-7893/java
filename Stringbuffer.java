class Buffer
{
public static void main(String args[])
{
StringBuffer sb1=new StringBuffer("NITHIN KUMAR");
System.out.println("before sb1="+sb1);
sb1.delete(6,(sb1.length()));
System.out.println("after deletion sb1="+sb1);
StringBuffer sb2=new StringBuffer("my name is NITHIN");
System.out.println("before sb2="+sb2);
sb2.deleteCharAt(8);
System.out.println("after deletion sb2="+sb2);
}
}