/*
Kitchen Timetable
Read problems statements in Mandarin Chinese, Russian and Vietnamese as well.
There are N students living in the dormitory of Berland State University. Each of them sometimes wants to use the kitchen, so the head of the dormitory came up with a timetable for kitchen's usage in order to avoid the conflicts:

The first student starts to use the kitchen at the time 0 and should finish the cooking not later than at the time A1.
The second student starts to use the kitchen at the time A1 and should finish the cooking not later than at the time A2.
And so on.
The N-th student starts to use the kitchen at the time AN-1 and should finish the cooking not later than at the time AN
The holidays in Berland are approaching, so today each of these N students wants to cook some pancakes. The i-th student needs Bi units of time to cook.

The students have understood that probably not all of them will be able to cook everything they want. How many students will be able to cook without violating the schedule?

Input Format
The first line of the input contains an integer T denoting the number of test cases. The description of T test cases follows.
Each test case contains 3 lines of input

The first line of each test case contains a single integer N denoting the number of students.
The second line contains N space-separated integers A1, A2, ..., AN denoting the moments of time by when the corresponding student should finish cooking.
The third line contains N space-separated integers B1, B2, ..., BN denoting the time required for each of the students to cook.

Output Format
For each test case, output a single line containing the number of students that will be able to finish the cooking.

Constraints
1 ≤ T ≤ 10
1 ≤ N ≤ 10^4
0 < A1 < A2 < ... < AN < 10^9
1 ≤ Bi ≤ 10^9

Sample 1:
Input
2
3
1 10 15
1 10 3
3
10 20 30
15 5 20

Output
2
1

Explanation:
Example case 1. The first student has 1 unit of time - the moment 0. It will be enough for her to cook. The second student has 9 units of time, but wants to cook for 10 units of time, and won't fit in time. The third student has 5 units of time and will fit in time, because needs to cook only for 3 units of time.

Example case 2. Each of students has 10 units of time, but only the second one will be able to fit in time.
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
	  { int c=0;
	      int n=sc.nextInt();
	      int a[]=new int[n];
	      int b[]=new int[n];
	      for(int i=0;i<n;i++)
	      {
	          a[i]=sc.nextInt();
	      }
	      for(int i=0;i<n;i++)
	      {
	          b[i]=sc.nextInt();
	      }
	      if(a[0]>=b[0])
	      c++;
	         for(int i=1;i<n;i++)
	         {
	             if((a[i]-a[i-1])>=b[i])
	             {
	                 c++;
	             }
	         }
	         System.out.println(c);
	  }

	}
}
