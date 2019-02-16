import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Solution {
	
	// Complete the hackerrankInString function below.
    static String hackerrankInString(String s) {

    	final String hr = "hackerrank";
    	
    	// **** perform some sanity checks ****
    	if (s.length() < hr.length())
    		return "NO";
    	
    	// **** traverse the hackerrank string ****
    	int startIndex = 0;
    	for (int i = 0; (i < hr.length()) && (startIndex <= s.length()); i++) {
    		
    		// **** get the next character from "hackerrank"****
    		char ch = hr.charAt(i);
    		
    		// **** start at this point in s ****
    		String ss = s.substring(startIndex);
    		
    		// **** get the index for this character in the substring ****
    		int index = ss.indexOf(ch);
    		
    		// **** this character not found ****
    		if (index == -1)
    			return "NO";
    		    		
    		// **** update the start index ****
    		startIndex += (index + 1);
    	}
    	    	
    	// **** hackerrank found ****
    	return "YES";
    }


    private static final Scanner scanner = new Scanner(System.in);

    
	public static void main(String[] args) throws IOException {

		BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s = scanner.nextLine();

            String result = hackerrankInString(s);
            
//          System.out.println("main <<< result ==>" + result + "<==");

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        // **** ****
        bufferedWriter.close();

        // **** ****
        scanner.close();
	}

}
