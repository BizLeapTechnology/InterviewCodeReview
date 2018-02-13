import java.io.*;

public class EiEiSandi {
    public static String Name(String n)
    {
        String first = n.substring(0,n.indexOf(" "));
        String middle= n.substring(1, n.indexOf(" "));
        // name should be n
        String last = name.substring(n.indexOf(" "));
        String revname = last+middle + first;
        return revname;
    }
    public static void main(String args[])
    {
        String name;
        // name is not initialized
        System.out.println(" Enter name: " + name);
        Name(name); // need to receive with a variable
        System.out.print("Reverse name is"+name); // Final result is printing the same name
    }
}

/*
- does not follow Naming convention
    - Method name
    - Variable name
- There is a bug // line 19
- substring() is not properly used
- line 9 got error
 */
