import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class KaungHtetLin {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        ArrayList al =new ArrayList();
        StringTokenizer st=new StringTokenizer(br.readLine());
        while(st.hasMoreTokens())
            al.add(st.nextToken().toString());
        Collections.reverse(al);
        System.out.println(al);
    }
}

/*
- Pass Testing
- 2nd Part - Pass
- Follow naming convention
- 10 of 10
 */