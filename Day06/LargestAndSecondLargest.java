/*
 * Problem: Largest and Second Largest
 * 
 * You are given an array A of N integers. Your task is to find the maximum sum of two distinct integers in the array.
 * 
 * Note: It is guaranteed that there exist at least two distinct integers in the array.
 * 
 * Input Format:
 * The first line of input will contain a single integer T, denoting the number of test cases.
 * Each test case consists of:
 * - The first line contains a single integer N — the size of the array.
 * - The second line contains N space-separated integers, denoting the array A.
 * 
 * Output Format:
 * For each test case, output on a new line, the maximum sum of two distinct integers in the array.
 * 
 * Constraints:
 * 1 ≤ T ≤ 1000
 * 2 ≤ N ≤ 10^5
 * 1 ≤ A_i ≤ 1000
 * The sum of N over all test cases does not exceed 2 * 10^5.
 * 
 * Sample Input:
 * 4
 * 3
 * 4 1 6
 * 7
 * 3 7 2 1 1 5 3
 * 5
 * 8 2 9 4 9
 * 2
 * 1 2
 * 
 * Sample Output:
 * 10
 * 12
 * 17
 * 3
 * 
 * Explanation:
 * Test case 1: The array is [4, 1, 6]. The maximum sum of two distinct elements is 4 + 6 = 10.
 * Test case 2: The array is [3, 7, 2, 1, 1, 5, 3]. The maximum sum of two distinct elements is 7 + 5 = 12.
 * Test case 3: The array is [8, 2, 9, 4, 9]. The maximum sum of two distinct elements is 8 + 9 = 17.
 * Test case 4: The array is [1, 2]. The maximum sum of two distinct elements is 1 + 2 = 3.
 * 
 * The problem ensures that there are at least two distinct integers in the array.
 * 
 */

import java.io.*;
import java.util.*;

class Solution
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int max=a[0];
        for(int i=0;i<n;i++)
        {
         if(a[i]>max)
         {
             max=a[i];
         }
        }
        
        int nextmax=Integer.MIN_VALUE;
         for(int i=0;i<n;i++)
        {
         if(a[i]!=max && a[i]>nextmax)
         {
             nextmax=a[i];
         }
        }
        System.out.println(max+nextmax);
        
    }
}}
    
