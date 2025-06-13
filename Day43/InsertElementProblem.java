/*
Coding problem - 1

You are given the following as a user input:

First line contains the integer 
N.
The second line contains 
N
space separated integers.
The third line contains an integer 
X.
You need to insert 
X
as the 1st and last element and output the list.
Your list will now have 
N + 2
elements.
Check the sample output for more details.

Sample 1:
Input
5
1 3 5 7 9
4

Output
4 1 3 5 7 9 4
*/
import java.util.*;

class Codechef
{
	public static void main (String[] args) 
	{
	    Scanner sc=new Scanner(System.in);
	 int n=sc.nextInt();
	 int a[]=new int[n];
	 for(int i=0;i<n;i++)
	 {
	     a[i]=sc.nextInt();
	 }
	 int x=sc.nextInt();
	 int newlength=n+2;
    int newarray[]=new int[newlength];
     newarray[0]=x;
     newarray[newlength-1]=x;
     
    for(int i=1;i<newlength-1;i++)
    {
        newarray[i]=a[i-1];
    }
   
    
    for(int i=0;i<newlength;i++)
    {
        System.out.print(newarray[i]+" ");
    }
	}
}
