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
        int n = scanner.nextInt();
        String s = "";
        int count = 0, a, max = 0;
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        while (n > 0) {
            a = n % 2;
            s = s + "" + a;
            n = n / 2;
        }

        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == '1') {
                count++;
                if (count > max) {
                    max = count;
                }
            } else {
                count = 0;
            }
            
        }
        System.out.println(max);
        
        scanner.close();
    }
}
