import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class HtetHtetWai {
    public static void main(String[] args) {
        String input="Htet Htet Wai";
        StringTokenizer token=new StringTokenizer(input);
        ArrayList list=new ArrayList( );

        while(token.hasMoreTokens( ))
            input.add(token.nextToken( ).toString( ));

        Collections.reverse(input);
        for(int i=0;i<list.size( );i++)
        {
            System.out.print(list.get(i)+" ");
        }

    }
}
/*
- Fail Testing
 */