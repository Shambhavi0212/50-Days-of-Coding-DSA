/*
Bomb the base

In Chefland, there are N houses numbered from 1 to N, 
i-th house has a defence system having strength A[i].

Chef suspects a bomb drop on one of the houses very soon. 
A bomb with attack strength X can destroy the i-th house, 
if the defence system of the i-th house A[i], is strictly less than X.

Also, when the i-th house is destroyed due to the bomb, 
all houses with indices j such that 1 ≤ j < i get destroyed as well 
irrespective of their defence system.

Given one bomb with attack strength X, find the maximum number 
of houses that can get destroyed.

Input Format:
The first line will contain T - the number of test cases. 
Then the test cases follow.

First line of each test case contains 2 integers N, X.
Second line of test case contains N space separated integers 
A1, A2, …, AN.

Output Format:
For each test case, output in a single line the maximum number 
of houses that can get destroyed if the bomb can hit any house.

Constraints:
1 ≤ T ≤ 100
1 ≤ N ≤ 10^5
1 ≤ X ≤ 10^9
1 ≤ Ai ≤ 10^9
Sum of N over all test cases does not exceed 10^5

Sample 1:
Input
2
8 6
4 1 6 1 6 5 6 8
2 1
3 5

Output
6
0

Explanation:
Test Case 1: The bomb can only destroy houses 1, 2, 4, and 6.
If it hits house 1, only house 1 is destroyed.
If it hits house 2, houses 1 and 2 are destroyed.
If it hits house 4, houses 1, 2, 3, and 4 are destroyed.
If it hits house 6, houses 1, 2, 3, 4, 5, and 6 are destroyed.
The maximum number of destroyed houses is 6.

Test Case 2: The bomb cannot destroy any of the houses 
as the defence system of each house is not lesser than attack power of bomb.
Thus, the total number of destroyed houses is 0.
*/
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
     
        while(t-->0)
        {   int max=0;
            int n=sc.nextInt();
            int x=sc.nextInt();
            int a[]=new int[n];
            for(int i=0;i<n;i++)
            {
                a[i]=sc.nextInt();
            }
            for(int i=0;i<n;i++)
            {
                if(a[i]<x)
                {
                    max=i+1;
                }
            }
            
            System.out.println(max);
        }
    }
}