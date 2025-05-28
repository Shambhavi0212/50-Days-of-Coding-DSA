/*
ASCII Sum of Each Word - Problem

Given a sentence S, print the ASCII sum for each word.

Input Format:
A single line containing the string S.

Constraints:
S consists of uppercase and lowercase letters and spaces.

Output Format:
Print each word followed by its ASCII sum.

Sample Input 0:
abc de

Sample Output 0:
abc : 294 de : 201

Sample Input 1:
Hello World

Sample Output 1:
Hello : 500 World : 520
*/
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        
        String w[]=s.split(" ");
        for(int i=0;i<w.length;i++)
        { int sum=0;
            for(int j=0;j<w[i].length();j++)
            {
                int asci=w[i].charAt(j);
                 sum=sum+asci;
            }
         System.out.print(w[i]+" : "+sum+" ");
        }
    }
}