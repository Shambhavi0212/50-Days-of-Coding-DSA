/*
Given a sentence S, write a Java program that reverses only the words that start with a consonant. 
Words that start with a vowel (a, e, i, o, u - case insensitive) should remain unchanged. 
If no word starts with a consonant, print: No Vowel Starting Word is present in String

Input Format:
A single line containing the string S.

Constraints:
1 ≤ S.length() ≤ 1000
Input contains only English alphabets and single spaces.
No punctuation, special characters, or extra spaces.

Output Format:
A single line where each word that starts with a consonant is reversed, and all other words remain unchanged.
If no such word is found, print: No Vowel Starting Word is present in String

Sample Input 0:
Hello Everyone how are Doing

Sample Output 0:
olleH Everyone woh are gnioD

Sample Input 1:
kumar went to Hyd

Sample Output 1:
No Vowel Starting Word is present in String
*/
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String w[]=s.split(" ");
         int v=0;
        for(int i=0;i<w.length;i++)
        {
           char ch=w[i].charAt(0);
                if(ch=='a' || ch=='e' || ch=='i' || ch=='o'|| ch=='u'||ch=='A' || ch=='E' || ch=='I' || ch=='O'|| ch=='U')
                {
                   v++;
                }
        }
        if(v==0)
        {
            System.out.print("No Vowel Starting Word is present in String");
        }
        else
        {
            for(int i=0;i<w.length;i++)
            {
                char c=w[i].charAt(0);
                if(c!='a' && c!='e' && c!='i' && c!='o'&& c!='u'&& c!='A' && c!='E' && c!='I' && c!='O'&& c!='U')
                {
                    StringBuilder s1=new StringBuilder(w[i]);
                    System.out.print(s1.reverse().toString()+" ");
                }
                else
                {
                    System.out.print(w[i]+" ");
                }
            }      
        }
    }}
