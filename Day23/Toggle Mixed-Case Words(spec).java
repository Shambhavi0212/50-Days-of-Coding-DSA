/*
Toggle Mixed-Case Words

Problem:
You are given a sentence S that may contain multiple words. Write a Java program that toggles the case of each alphabet in words that contain both uppercase and lowercase characters (i.e., mixed-case words).

Toggle means:
- Lowercase characters become uppercase.
- Uppercase characters become lowercase.

Words that are entirely in lowercase or entirely in uppercase should be left unchanged.

If none of the words in the input string are mixed-case, print: We Cant toggle

Input Format:
- A single line containing the string S.

Constraints:
- 1 ≤ S.length() ≤ 1000
- Input contains only alphabets and single spaces.
- No special characters or punctuation marks.
- No leading or trailing spaces.

Output Format:
- A single line where all mixed-case words are toggled.
- If no word was toggled, print: We Cant toggle

Sample Input 0:
HeLLo Adam

Sample Output 0:
hEllO aDAM

Sample Input 1:
hello adam

Sample Output 1:
We Cant toggle
*/
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int l=0,u=0;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
                if(ch>='a' && ch<='z')
                {
                    l++;
                }
            else if(ch>='A' && ch<='Z')
            {
                u++;
            }
        }
        
        
        if(l==0 || u==0)
        {
            System.out.print("We Can't toggle");
        }
        else
        {
            for(int i=0;i<s.length();i++)
            {
                char c=s.charAt(i);
                if(c>='a' && c<='z')
                {
                    String s1=c+"";
                    System.out.print(s1.toUpperCase());
                }
                else if(c>='A' && c<='Z')
                {
                    String s2=c+"";
                    System.out.print(s2.toLowerCase());
                }
                else
                {
                    System.out.print(c);
                }
            }
        }
    }
}