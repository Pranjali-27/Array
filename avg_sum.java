import java.util.*;
class avg_sum
{
public static void main(String args[])
{
  Scanner x=new Scanner(System.in);
   int sum=0;
   int i;
   int avg=0;
   int[] a=new int[10];
  System.out.println("Enter the element");
   for( i=0;i<10;i++)
    a[i]=x.nextInt();
   
   System.out.println("print the sum and avg");
   for(i=0 ; i<10 ; i++)
  {
      sum=sum+a[i];
      
    }
  avg=sum/10;
     System.out.println("print the sum of no" + sum);
     System.out.println("Print the avg of no" + avg);
}
}
Output:
C:\Users\AT SYSTEMS\SkyDrive\Documents\Array>java avg_sum
Enter the element
10
8
5
6
3
9
1
2
7
4
print the sum and avg
print the sum of no 55
Print the avg of no 5

C:\Users\AT SYSTEMS\SkyDrive\Documents\Array>
