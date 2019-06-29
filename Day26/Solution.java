import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);

        int de, da, me, ma, ye, ya;

        da = sc.nextInt();
        ma = sc.nextInt();
        ya = sc.nextInt();
        //System.out.println();
        de = sc.nextInt();
        me = sc.nextInt();
        ye = sc.nextInt();

        if (ye == ya) {
            if (ma == me) {
                if (da < de) {
                    System.out.println(15 * (da - de));
                }
            } else {
                System.out.println(500 * (ma - me));
            }
        } else {
            System.out.println("10000");
        }

        
        
    }
}

