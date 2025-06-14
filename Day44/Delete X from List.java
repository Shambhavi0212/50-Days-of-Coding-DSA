/*
Coding problem - 2

You are given the following as a user input:

First line contains the integer 
N
N.
The second line contains 
N
N space separated integers.
The third line contains an integer 
X
X.
You need to delete all occurrences of 
X
X from the list and output the new list.
Check the sample output for more details.

Sample 1:
Input
Output
5
1 3 5 7 9
4
1 3 5 7 9

Sample 2:
Input
Output
5
1 3 5 3 9
3
1 5 9
*/

import java.util.Scanner;

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
        
        int newindex=0;
        
        for(int i=0;i<a.length;i++)
        {
            if(a[i]!=x)
            {
               a[newindex]=a[i];
               newindex++;
            }
        }
        for(int i=0;i<newindex;i++)
        {
            System.out.print(a[i]+" ");
        }
	}
}
