import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ZinMarMoe {
    public static void main(String[] args) {
        String input="";
        System.out.println("Enter your name:");
        try
        {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            input = br.readLine();
            char[] name= input.toCharArray();
            for (int i=name.length-1;i>=0;i--)
                System.out.print(name[i]);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

}
/*
- Fail Testing
- Reverse Everything
 */