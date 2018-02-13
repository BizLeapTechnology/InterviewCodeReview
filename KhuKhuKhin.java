import java.util.Scanner;

import static com.sun.tools.doclint.Entity.quot;

public class KhuKhuKhin {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please write sentences:");
        String se=sc.nextLine();
        String result="";
        String[] reverse=se.split("");

        for(int i=reverse.length-1;i>=0;i--)
        {
            result+=reverse[i]+"";
        }
        System.out.println("Reverse result is:"+result.trim());
    }
}
/*
- Fail Test
- Reverse Everything
 */