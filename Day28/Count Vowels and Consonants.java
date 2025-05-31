/*
Given a sentence S, count the number of vowels and consonants.

Input Format

A single line containing the string S.

Constraints

S consists of uppercase and lowercase letters and spaces.

Output Format

Print the count of vowels and consonants.

Sample Input 0

India is my country
Sample Output 0

Vowels: 6, Consonants: 10

Sample Input 1

Hello World
Sample Output 1

Vowels: 3, Consonants: 7
*/
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int v=0,c=0;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if((ch>='A'&& ch<='Z') || (ch>='a'&& ch<='z'))
            {
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
            {
                v++;
            }
            else
            {
                c++;
            }
        } 
        }//Vowels: 3, Consonants: 7
        System.out.print("Vowels: "+v+", Consonants: "+c);
    }
}