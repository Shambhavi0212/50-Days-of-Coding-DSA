/*
The Squid Game
"Let the games begin."

Squid Game has become a blockbuster hit and the frontman is now finding it difficult to accommodate all the participants in Squid Game 2.0. 
So, he decided that he will allow only those participants who could solve the following problem.

There are a total of N players who are competing in the Squid Game, numbered from 1 to N. 
When the ith player gets eliminated from the game, Ai amount of money is added to the prize pool. 
The game is played until N−1 players get eliminated, and the only player left is declared as the winner. 
The winner gets all the money present in the prize pool.

You are given an array A consisting of N elements, where Ai denotes the prize money added to the prize pool 
when the ith player gets eliminated from the game. 
Find the maximum prize that the winner can get, given that you can choose any player to be the winner.

Input Format:
The first line of input contains a single integer T, denoting the number of test cases. 
The description of T test cases follows. 
The first line of each test case contains an integer N, denoting the number of players. 
The second line of each test case contains N space-separated integers A1, A2, …, AN, 
denoting the amount of money added to the prize pool when the ith (1≤i≤N) player dies.

Output Format:
For each test case, output in a single line the maximum prize that the winner can get, 
given that you can choose any player to be the winner.

Constraints:
1 ≤ T ≤ 1000
2 ≤ N ≤ 10^5
0 ≤ Ai ≤ 10^4
The sum of N across all test cases does not exceed 10^6.

Sample 1:
Input
3
3
3 1 2
5
1 1 1 1 1
6
3 6 4 2 5 1

Output
5
4
20

Explanation:

Test Case 1:
If we choose the first player to be the winner, he will win the game when the second and third players die. 
Hence, the amount of money won by him will be 1 + 2 = 3.
If we choose the second player to be the winner, he will win the game when the first and third players die. 
Hence, the amount of money won by him will be 3 + 2 = 5.
If we choose the third player to be the winner, he will win the game when the first and second players die. 
Hence, the amount of money won by him will be 3 + 1 = 4.
Therefore, we can clearly see that the maximum amount of money that can be won by any player is 5.

Test Case 2:
Irrespective of who is chosen, the winner will always win an amount of 4.

Test Case 3:
If we choose the sixth player to be the winner, the amount won by him will be 3 + 6 + 4 + 2 + 5 = 20. 
It can be proven that if we choose any other player to be the winner, the amount is less than 20. 
Hence, the maximum amount of money that can be won by any player is 20.
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
	   
	    while(t-- > 0)
	    {
	        int n=sc.nextInt();
	         int a[]=new int[n];
	        for(int i=0;i<n;i++)
	        {
	            a[i]=sc.nextInt();
	        }
	        
	        int minElement=Integer.MAX_VALUE;
	        int totalsum=0;
	        for(int i=0;i<a.length;i++)
	        {
	            totalsum=totalsum+a[i];
	            minElement=Math.min(minElement,a[i]);
	        }
	        System.out.println(totalsum-minElement);
	    }
	    
	}
}