import java.util.*;
class Array_evensum
{
public static void main(String args[])
{
  Scanner x=new Scanner(System.in);
   int evensum=0;
   int i;
   int[] a=new int[10];
  System.out.println("Enter the element in an Array");
   for( i=0;i<10;i++)
    a[i]=x.nextInt();
   
   System.out.println("print the sum and avg of Array");
   for(i=0 ; i<10 ; i++)
  { 
      if(a[i]%2==0)
      evensum=evensum+a[i];
      
    }
     System.out.println("print the sum of even number" + evensum);
     
}
}
Output
C:\Users\AT SYSTEMS\SkyDrive\Documents\Array>java Array_evensum
Enter the element in an Array
10
9
8
6
5
3
2
1
4
7
print the sum and avg of Array
print the sum of even number30

C:\Users\AT SYSTEMS\SkyDrive\Documents\Array>
