import java.util.StringTokenizer;

public class ZawZinPhyoe {
    public static void main(String[] args) {
        String strToReverse = "To reverse string";
        StringTokenizer st = new StringTokenizer(strToReverse, " ");
        String strReversedString = "";
        while (st.hasMoreTokens()) {
            strReversedString = st.nextToken() + " " + strReversedString;
        }
        System.out.println("Reversed string by word is : " + strReversedString);
    }
}
/*
- Pass Test
- 10 of 10
 */