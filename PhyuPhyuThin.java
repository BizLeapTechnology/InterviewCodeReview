import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PhyuPhyuThin {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter your Name : ");
        String name = br.readLine();
        String reverse = StringReverse(name);
        System.out.println(reverse);
    }
    private static String StringReverse(String name)
    {
        char[] ch = new char[name.length()];
        for(int i =0; i<name.length(); i++)
        {
            ch[i] = name.charAt(name.length()-1-i);
        }
        name = name.copyValueOf(ch);
        String reverseWord = "";
        String eachWord;
        for(String part:name.split(" "))
        {
            eachWord = new StringBuilder(part).reverse().toString();
            reverseWord = reverseWord+eachWord+" ";
        }
        return reverseWord;
    }
}
/*
- Pass Testing
- 2nd Part Pass
- 10 of 10
 */