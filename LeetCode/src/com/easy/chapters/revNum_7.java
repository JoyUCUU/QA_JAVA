package com.easy.chapters;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Solution {
    public int reverse(int x) {
    	int reverNum= 0 ;
        int temp = x;
		 while(temp != 0){	
			    int y = temp%10;
				temp = temp/10;
                if (reverNum > Integer.MAX_VALUE/10 || (reverNum == Integer.MAX_VALUE / 10 && y > 7)) return 0;
            if (reverNum < Integer.MIN_VALUE/10 || (reverNum == Integer.MIN_VALUE / 10 && y < -8)) return 0;
				reverNum = reverNum *10 +y;	            
			}
		 return reverNum;
        
    }
}

public class revNum_7 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            int x = Integer.parseInt(line);
            
            int ret = new Solution().reverse(x);
            
            String out = String.valueOf(ret);
            
            System.out.print(out);
        }
    }
}