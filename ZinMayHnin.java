import java.util.Scanner;
import java.util.StringTokenizer;

public class ZinMayHnin {
    public static void main(String args[]) {
        String[] arr = new String[3];
        int i=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = sc.nextLine();
        StringTokenizer st = new StringTokenizer(name, " ");
        while(st.hasMoreTokens()){
            arr[i] = st.nextToken().toString();
            i++;
        }
        for(int j=i-1;j>=0;j-- ){
            System.out.print(arr[j]+" ");
        }
    }
}
/*
- Pass Testing
- Follow naming convention
- 10 of 10
 */
