/*
Write a Java program to print the first non-repeating character in a given string

Input Format

A single string s

Constraints

1 <= length of s <= 1000 All characters are lowercase alphabets.

Output Format

Print the first non-repeating character. If none found, print "None".

Sample Input 0

success
Sample Output 0

u
Sample Input 1

level
Sample Output 1

v
*/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine().toLowerCase();
        boolean found=false;
        for(int i=0;i<s.length();i++)
        {
            int d=0;
            char ch=s.charAt(i);
            for(int j=0;j<s.length();j++)
            {
                char c=s.charAt(j);
                {
                    if(i!=j && ch==c)
                    {
                        d++;
                    }
                }
            }
            if(d==0)
            {
                System.out.println(ch);
                found =true;
                break;
            }}
        
        
        if(!found)
        {
                System.out.println("None");
            }
        }
}