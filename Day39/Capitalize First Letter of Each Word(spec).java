/*
Capitalize First Letter of Each Word(spec)
Problem
You are given a string containing multiple words separated by spaces. 
Your task is to return the string with the first letter of each word capitalized 
and the rest of the letters unchanged.

Input Format
A single line containing a string s with one or more words separated by a single space

Constraints
1 ≤ |s| ≤ 10^4 
The input string contains only lowercase English letters and spaces. 
Words are separated by exactly one space. No leading or trailing spaces.

Output Format
Print the string with each word's first letter capitalized

Sample Input 0
openai builds ai

Sample Output 0
Openai Builds Ai

Sample Input 1
data science with python

Sample Output 1
Data Science With Python
*/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String w[]=s.split(" ");
        String result="";
        for(int i=0;i<w.length;i++)
        {
              char ch=Character.toUpperCase(w[i].charAt(0));
              String rest="";
            for(int j=1;j<w[i].length();j++)
            {
              rest=rest+w[i].charAt(j);
          }
            result=result+ch+rest+" ";
        }
        System.out.println(result);
    }
}