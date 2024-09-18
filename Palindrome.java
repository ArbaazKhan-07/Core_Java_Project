package com.logic;

import java.util.*;
public class Palindrome
{

public static void main (String []args){

// Palindrome is a word which can be read from both side and word remain same 
// for eg :- Madam <--> madaM , 121 - 121

System.out.println("Enter any name ");
// Scanner sc = new Scanner(Systen.in);
String revrs ="";
String str = "madam";

for (int i = str.length()-1; i>=0; i--){

     revrs += str.charAt(i);
     System.out.println("Reveresed String:"+revrs);

}
System.out.println("Orginial String:"+str);
System.out.println("Reveresed String:"+revrs);
}

}