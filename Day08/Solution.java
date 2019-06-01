//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        Map<String, String> phoneNumberMap = new HashMap<String, String>();
        int n = in.nextInt();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            // Write code here

            String phoneNumber = Integer.toString(phone);

            phoneNumberMap.put(name, phoneNumber);
        }
        while(in.hasNext()){
            String s = in.next();
            // Write code here
            String num = phoneNumberMap.get(s);
            if (num != null) {
                System.out.println(s + "=" + num);
            } else {
                System.out.println("Not found");
            }
        }
        in.close();
    }
}

