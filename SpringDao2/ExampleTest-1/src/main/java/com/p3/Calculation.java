package com.p3;

import java.util.StringTokenizer;

public class Calculation {  
   
    //method that returns cube of the given number  
    public static int cube(int n){  
        return n*n*n;  
    }  
    //method that returns reverse words   
    public static String reverseWord(String str){  
  
        StringBuilder result=new StringBuilder();  
        StringTokenizer tokenizer=new StringTokenizer(str," ");  
  
        while(tokenizer.hasMoreTokens()){  
        StringBuilder sb=new StringBuilder();  
        sb.append(tokenizer.nextToken());  
        sb.reverse();  
  
        result.append(sb);  
        result.append(" ");  
        }  
        return result.toString();  
    }  
}  