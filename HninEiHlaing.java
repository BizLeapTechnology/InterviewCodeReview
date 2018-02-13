import java.util.Stack;
import java.util.StringTokenizer;

public class HninEiHlaing {
    public static void main(String[] args) {
        String s = "First Middle Last";

        Stack<String> myStack = new Stack<String>();
        StringTokenizer st = new StringTokenizer(s);
        while (st.hasMoreTokens()) myStack.push((String) st.nextElement());

        System.out.print('"' + s + '"' + " backwards by word is:\n\t\"");
        while (!myStack.empty()) {
            System.out.print(myStack.pop());
            System.out.print(' ');
        }
        System.out.println('"');

    }
}
/*
- Pass Testing
- 10 of 10
 */
