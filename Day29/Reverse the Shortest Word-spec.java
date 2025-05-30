/*
Reverse the Shortest Word-spec

Problem

Given a sentence ( S ) consisting of words separated by spaces, find the shortest word in the sentence and print its reverse. If multiple words share the shortest length, return the first shortest word encountered.

Input Format

A single line containing a string ( S ), consisting of words separated by spaces.

Constraints

• S contains only lowercase and uppercase English letters and spaces. • Words are separated by a single space, and no leading or trailing spaces are present.

Output Format

Print the reverse of the shortest word found in S.

Sample Input 0

This is a test

Sample Output 0

a

Sample Input 1

AI is the future.

Sample Output 1

IA
*/
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String w[]=s.split(" ");
         String min=w[0];
        for(int i=0;i<w.length;i++)
        {
        if(w[i].length()<min.length())
        {
            min=w[i];
        }
        }
        StringBuilder s1=new StringBuilder(min);
        System.out.print(s1.reverse());
    }
}