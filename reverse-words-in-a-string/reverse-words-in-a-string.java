class Solution {
    public String reverseWords(String s) {
        int i = s.length()-1;
        StringBuilder output = new StringBuilder();
        
        
        while(i>=0) {
            
            
            while(i>=0 && s.charAt(i)== ' ') i--;
            if(i<0) break;
            int j = i;
            
            while(i>=0 && s.charAt(i)!= ' ') i--;
            
            if(output.length() == 0) {
                output = output.append(s,i+1,j+1);
            } else {
                output = output.append(" ").append(s,i+1,j+1);
            }
        }
        
        return output.toString();
    }
}




// public String reverseWords1(String s) {
//         int i = s.length()-1;
//         String output = "";
        
        
//         while(i>=0) {
            
            
//             while(i>=0 && s.charAt(i)== ' ') i--;
//             if(i<0) break;
//             int j = i;
            
//             while(i>=0 && s.charAt(i)!= ' ') i--;
            
//             if(output.isEmpty()) {
//                 output = s.substring(i+1,j+1);
//             } else {
//                 output = output.concat(" " + s.substring(i+1,j+1));
//             }
//         }
        
//         return output;
//     }