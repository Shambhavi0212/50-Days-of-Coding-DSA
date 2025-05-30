/*
 * Search an Element in an Array
 *
 * You are given an array A of size N and an element X. Your task is to find 
 * whether the array A contains the element X or not.
 */

/*
 * Input Format:
 * - The first line contains two space-separated integers N and X — 
 *   the size of the array and the element to be searched.
 * - The second line contains all the elements of array A.
 */

/*
 * Output Format:
 * - Output "YES" if the element X is present in A, otherwise output "NO".
 */

/*
 * Constraints:
 * - 1 ≤ N ≤ 10^5
 * - 1 ≤ A[i] ≤ 10^5
 */

/*
 * Sample 1:
 * Input:
 * 5 3
 * 7 3 5 2 1
 *
 * Output:
 * YES
 */

/*
 * Sample 2:
 * Input:
 * 5 10
 * 7 3 5 2 1
 *
 * Output:
 * NO
 */
import java.io.*;
import java.util.*;

class Solution
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int x=sc.nextInt();
        int flag=0;
        
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            if(a[i]==x)
            {
             flag=1;  
            }
        }
        
     if(flag==1)
     {
         System.out.println("YES");
     }
     else{
        System.out.println("NO");
     }  
    }}