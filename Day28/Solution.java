import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        String myRegEx = ".+@gmail\\.com$";

        Pattern p = Pattern.compile(myRegEx);

        ArrayList<String> list = new ArrayList<String>();
        

        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int NItr = 0; NItr < N; NItr++) {
            
            String[] firstNameEmailID = scanner.nextLine().split(" ");

            String firstName = firstNameEmailID[0];

            String emailID = firstNameEmailID[1];

            Matcher m = p.matcher(emailID);

            if(m.find()) {
                list.add(firstName);
            }
        }

        Collections.sort(list);

        for(String s : list) {
            System.out.println(s);
        }
        

        scanner.close();
    }
}
