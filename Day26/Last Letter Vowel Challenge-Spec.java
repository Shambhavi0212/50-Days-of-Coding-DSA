/*
Given a sentence S, count how many words in S end with a vowel (a, e, i, o, u).

Input Format:
A single line containing the string S of length 1 ≤ |S| ≤ 10^5.

Constraints:
• S consists of uppercase and lowercase letters and spaces.
• Words are separated by single spaces.

Output Format:
Print an integer, the count of words ending with a vowel.

Sample Input 0:
Hello you are awesome

Sample Output 0:
4

Sample Input 1:
I like Java programming

Sample Output 1:
3
*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String args[] ) throws Exception {
        Scanner sc=new Scanner(System.in);
        String S=sc.nextLine();
        String w[]=S.split(" ");
        int v=0;
        for(int i=0;i<w.length;i++)
        {
            int l=w[i].length()-1;
            char c=w[i].charAt(l);
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c== 'U')
            {
                v++;
            }
        }
        System.out.println(v);
    }
}