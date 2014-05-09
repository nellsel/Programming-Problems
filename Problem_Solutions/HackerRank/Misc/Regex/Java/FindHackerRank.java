import java.io.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class FindHackerRank {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */		
        
        try{
		BufferedReader br = 
                      new BufferedReader(new InputStreamReader(System.in));
 
		String input;
        input = br.readLine();
		while((input=br.readLine())!=null){
			System.out.println(isHackerRank(input));
		}
 
	}catch(IOException io){
		io.printStackTrace();
        }	
		
    }
    
    public static int isHackerRank(String str){
			String pattern = "^hackerrank.*";
			boolean match1 = str.matches(pattern);
			String pattern2 = ".*hackerrank$";
			boolean match2 = str.matches(pattern2);
			if(match1 && match2)return 0;
			else if(match1) return 1;
			else if(match2)return 2;
			else return -1;			
	}
}
