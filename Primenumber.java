class Primenumber  
{  
public static void main(String args[])   
{  
int count=0,number=0,i=1,j=1;
System.out.println("***PRIME NUMBERS B/W   1  TO  100  ***");  
while(number<25)  
{  
j=1;  
count=0;  
while(j<=i)  
{  
if(i%j==0)  
count++;  
j++;   
}  
if(count==2)  
{  
System.out.println(i);  
number++;  
}  
i++;  
}    
}  
}  
