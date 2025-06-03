/*
Write a Java program to count uppercase letters, lowercase letters, digits, and special characters in a string.

Input Format

A single string s.

Constraints

1 <= length of s <= 1000 Mix of any characters.

Output Format

Print the result in format: 
Uppercase: X
Lowercase: Y
Digits: Z
Special Characters: W

Sample Input 0

Java@123Power

Sample Output 0

Uppercase: 2  
Lowercase: 7  
Digits: 3  
Special Characters: 1

Sample Input 1

HelloWorld99!

Sample Output 1

Uppercase: 2  
Lowercase: 8  
Digits: 2  
Special Characters: 1
*/
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int l=0,u=0,n=0,sp=0;
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
            else if(ch>='0' && ch<='9')
            {
                n++;
            }
            else
            {
                sp++;
            }
                
        }
        System.out.println("Uppercase: "+u);
        System.out.println("Lowercase: "+l ); 
        System.out.println("Digits: "+n);
        System.out.println("Special Characters: "+sp);
        
    }
}