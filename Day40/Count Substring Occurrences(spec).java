/*
Count Substring Occurrences(spec)

Given a main string s and a substring sub, count how many times the substring appears in the main string. Overlapping occurrences should be counted

Input Format

The first line contains the main string s. The second line contains the substring sub.

Constraints

1 ≤ |s| ≤ 10^5
1 ≤ |sub| ≤ |s|
All characters in both strings are lowercase English letters (a–z).

Output Format

Print an integer representing the number of times sub appears in s, including overlapping matches

Sample Input 0

a
a

Sample Output 0

1

Sample Input 1

abcdefg
xyz

Sample Output 1

0
*/
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String sub=sc.nextLine();
        int c=0;
        for(int i=0;i<=s.length()-sub.length();i++)
        {
            if(s.substring(i,i+sub.length()).equals(sub))
               {
           c++;
        }}
     System.out.println(c);
               
    }}
