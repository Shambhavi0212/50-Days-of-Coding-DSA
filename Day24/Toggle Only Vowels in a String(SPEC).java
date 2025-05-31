/*
Toggle Only Vowels in a String (SPEC)

Problem:
You are given a sentence S. Your task is to write a Java program that toggles the case of only the vowels (a, e, i, o, u — both uppercase and lowercase) in the sentence.

Toggle means:
- Convert lowercase vowels to uppercase.
- Convert uppercase vowels to lowercase.
- All consonants and spaces must remain unchanged.

Input Format:
- A single line containing the string S.

Constraints:
- 1 ≤ S.length() ≤ 1000
- The string may contain both uppercase and lowercase English letters and spaces.
- No punctuation or special characters.

Output Format:
- A single line with all vowels toggled and all other characters preserved as-is.

Sample Input 0:
hello EverYone

Sample Output 0:
hEllO evErYOnE

Sample Input 1:
aaaBBBBiiii

Sample Output 1:
AAABBBBIIII
*/
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
        {
            String s1=ch+"";
            System.out.print(s1.toUpperCase());
        }
            else if(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U' )
            {
                String s2=ch+"";
                System.out.print(s2.toLowerCase());
            }
            else
            {
                System.out.print(ch);
            }
        }
    }
}