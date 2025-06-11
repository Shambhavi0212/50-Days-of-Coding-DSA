/*
Check for Palindrome(spec)
Problem

A palindrome is a word, phrase, number, or other sequence of characters that reads the same forward and backward (ignoring spaces, punctuation, and letter casing). Given a string s, determine if it is a palindrome. You should ignore case, spaces, and punctuation characters.

Input Format

A single line containing a string s.

Constraints

1 ≤ |s| ≤ 10^5 The string may contain letters, digits, spaces, and punctuation marks

Output Format

Print True if the input is a palindrome after normalization; otherwise, print False.

Sample Input 0

A man, a plan, a canal, Panama
Sample Output 0

true
Sample Input 1

!!!...,,,
Sample Output 1

true
*/
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine().toLowerCase();
        String result="";
    
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch>='a' && ch<='z' || ch>='0' && ch<='9' )
               {
                 result=result+ch;  
               }
        }
       StringBuilder str=new StringBuilder(result);
        str=str.reverse();
    if(str.toString().equals(result))
        System.out.println("true");
    else
        System.out.println("false");
    }
}
