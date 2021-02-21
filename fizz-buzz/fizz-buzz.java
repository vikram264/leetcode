class Solution {
    public List<String> fizzBuzz(int n) {
        int c3 = 0;
        int c5 = 0;
        List<String> output = new ArrayList<>();
        for(int i = 1;i<=n;i++) {
            c3++;
            c5++;
            StringBuilder s = new StringBuilder();
            if(c3==3) {
              
                c3 = 0;
                s.append("Fizz");
            }
            
            if(c5==5) {
              
                c5 = 0; 
                s.append("Buzz");
            }
            
            if(s.length() !=0) {
                output.add(s.toString());
            } else {
                output.add(String.valueOf(i));
            }
            
            
        }
        return output;
    }
}


/*
// package whatever; // don't place package name!

import java.io.*;

import java.util.*;

import java.lang.*;

class MyCode {
	public static void main (String[] args) {
		
    
    String s = "aaabbbbccdddeeeeccaa";
   // String s = "aaa";
    build(s);
    
	}
  
  public static String build(String input) {
    
    StringBuilder sb = new StringBuilder();
    int count = 1;
      for(int i = 0;i<input.length()-1;i++) {
       
        while(i<input.length()-1 && input.charAt(i)==input.charAt(i+1)  ) {
          // System.out.println(i);
          count++;
          i++;
        }
        
        sb.append(String.valueOf(count)).append(input.charAt(i));
        count = 1;
      }
      
       System.out.println(sb.toString());
      return sb.toString();   
  }
  
}


// 1). Input String = "aaabbbbccdddeeeeccaa"
//     Output = 3a4b2c3d4e2c2a
    
    
// 2).                   6
//                 5           7
//                   8       3    9
                  
//                   Output = 38



*/