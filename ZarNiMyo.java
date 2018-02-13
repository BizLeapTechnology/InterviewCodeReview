import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class ZarNiMyo {
    public static void main(String[] args) {
        String s="First Middle Last";
        StringTokenizer st=new StringTokenizer(s);
        ArrayList al =new ArrayList();
        while(st.hasMoreTokens())
            al.add(st.nextToken().toString());
        Collections.reverse(al);
        System.out.println(al);
    }
}
/*
- Pass Testing
- Follow naming convention
- 10 of 10
 */
