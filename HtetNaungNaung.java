import java.util.StringTokenizer;
import java.util.Vector;

public class HtetNaungNaung {
    public static void reverseString(String data){
//    data="Htet Naung Naung";
        StringTokenizer st =new StringTokenizer(data);
        Vector v=new Vector();
        while(st.hasMoreTokens()){
            v.add(st.nextToken().toString());
            for(int i=v.size()-1;i>=0;i--){
                if(i==0)
                    System.out.print(v.elementAt(i) + " ");
                else System.out.print(v.elementAt(i)+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        reverseString("First Second Third Fourth");
    }
}

/*
- Pass Testing
- 2nd Part - Pass
- Follow Naming Convention
- a syntax error in line 10  v.add(st.nextToken()).toString());
- 8 of 10
 */

