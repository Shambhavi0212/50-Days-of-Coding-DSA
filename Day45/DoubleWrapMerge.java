/*
Coding Problem - 3

You are given the following as a user input:
First line contains the integer N and X
The second line contains N space separated integers (List 1).
The third line contains X space separated integers (List 2).

You need to merge the lists such that your output is a single list - List 1 + List 2 + List 1.
Check the sample output below.

Sample 1:
Input
Output
5 5
1 3 5 7 9
1 2 3 4 5
1 3 5 7 9 1 2 3 4 5 1 3 5 7 9

Sample 2:
Input
Output
5 3
1 3 5 3 9
3 2 1
1 3 5 3 9 3 2 1 1 3 5 3 9
*/
import java.util.Scanner;

class Codechef
{
	public static void main (String[] args) 
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int x=sc.nextInt();
		int list1[]=new int[n+x+n];
		
		for(int i=0;i<n;i++)
		{
		  list1[i]=sc.nextInt();
		}
		for(int i=n;i<n+x;i++)
		{
		  list1[i]=sc.nextInt();
		} 
			for(int i=n+x;i<(n+x+n);i++)
		{
		  list1[i]=list1[i-n-x];
		} 
		for(int i=0;i<(n+x+n);i++)
		{
		    System.out.print(list1[i]+" ");
		}
		

	}
}

