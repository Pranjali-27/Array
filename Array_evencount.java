/* wap input 10 elements in array and count all even numbers*/


import java.util.*;
class Array_evencount
{
public static void main(String[] args)
{
Scanner x = new Scanner(System.in);
int i,evencount=0;
int[] a = new int[10];
System.out.println("Enter elements in Array");
for(i=0; i<10; i++)
a[i] = x.nextInt();


System.out.println("Print even count in Array");
for(i=0; i<10; i++)
{
if(a[i]%2==0)
{
System.out.println(a[i]+ " ");
evencount++;
}
}
System.out.println("Print count of even number" +evencount);
}
}


output:
C:\Users\AT SYSTEMS\SkyDrive\Documents\Array>javac Array_evencount.java

C:\Users\AT SYSTEMS\SkyDrive\Documents\Array>java Array_evencount
Enter elements in Array
10
9
8
7
5
6
2
3
1
4
Print even count in Array
10
8
6
2
4
Print count of even number5

C:\Users\AT SYSTEMS\SkyDrive\Documents\Array>




























