/*
Most Frequent Character(spec)
Problem

Given a string s, determine the character that appears most frequently in the string. In case of a tie (i.e., multiple characters have the highest frequency), return the one that appears first in the string.

Input Format
A single line containing a string s consisting of lowercase English letters only.
Constraints

1 ≤ |s| ≤ 10^5
s contains only lowercase English letters (a to z)

Output Format
Print a single character — the most frequent character as per the described condition

Sample Input 0
apple
Sample Output 0
p

Sample Input 1
aabbcc
Sample Output 1
a
*/
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char f=s.charAt(0);
        int c=0;
        char res=f;
        
        for(int i=0;i<s.length();i++)
        {
            int tempc=0;
            char ch=s.charAt(i);
            for(int j=i+1;j<s.length();j++)
            {
                if(ch==s.charAt(j))
                {
                       tempc++;
                }       
            }
            if(tempc>c)
            {
               c=tempc;
                res=ch;
            }
        }
     
         System.out.println(res);
    }
}
