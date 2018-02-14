import java.util.Scanner;

public class PyaePhyoZaw {
    public static void main(String[] args) {
        Scanner uip = new Scanner(System.in);
        System.out.println("Enter First Name");
        String fname = uip.next();
        System.out.println("Enter Middle Name");
        String mname = uip.next();
        System.out.println("Enter Last Name");
        String lname = uip.next();
        System.out.println("Your Name is : "+fname+" "+mname+" "+lname);
        System.out.println("Your Reverse Name is : "+lname+" "+mname+" "+fname);
    }
}

/*
- Pass Testing
- 2nd Part - Fail
 */