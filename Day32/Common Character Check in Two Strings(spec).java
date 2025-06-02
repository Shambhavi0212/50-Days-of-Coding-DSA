/*
Given two strings, determine whether they share at least one common character.
• If they share any character, print "Yes".
• Otherwise, print "No".

You are not allowed to use Collections like HashSet or ArrayList.

Input Format
• The first line contains the first string s1.
• The second line contains the second string s2.

Constraints
• 1 <= |s1|, |s2| <= 1000
• The strings may contain uppercase or lowercase English letters.

Output Format
• Print "Yes" if they share any common character, otherwise print "No".

Sample Input 0
hello
world

Sample Output 0
Yes

Sample Input 1
hi
world

Sample Output 1
No

Submissions: 3
Max Score: 20
Difficulty: Medium
Rate This Challenge:
*/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine().toLowerCase();
        String s2=sc.nextLine().toLowerCase();
        int p=0,np=0;
        for(int i=0;i<s1.length();i++)
        {
            for(int j=0;j<s2.length();j++)
            {
                if(s1.charAt(i)==s2.charAt(j))
                {
                    p++;
                    break;
                }
            }
        }
        if(p>=1)
        {
            System.out.print("Yes");
        }
        else
        {
            System.out.print("No");
        }
    }
}