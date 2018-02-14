import java.util.StringTokenizer;

public class ZawPhonePaing {
    public static void main(String[] args) {
        String name = "Zaw Phone Paing Fourth";
        StringTokenizer str = new StringTokenizer(name);
        String arr = new String[11];
        int size = 0;
        while(str.hasMoreTokens()){
            arr[size++] = str.nextToken().toString();
        }
        String result = "";
        for (int i = size-1; i >=0; i-- )
        {
            result += arr[i] + "";
        }
        System.out.println(result);
    }
}
/*
- Pass Testing
- 2nd Part - Pass
- Error in line 7 - String should be String array
 */
