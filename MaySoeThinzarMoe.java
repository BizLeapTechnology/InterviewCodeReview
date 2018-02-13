import java.io.*;
import java.util.*;
import java.util.Scanner;

public class MaySoeThinzarMoe {
    public static void main(String[] args) {
//        String Fname, Mname, Lname;
        System.out.println("please enter your first name,middle name and last name");
        Scanner input=new Scanner(System.in);
        String Fname = input.nextLine();
        String Mname = input.nextLine();
        String Lname = input.nextLine();
        System.out.println(Lname + " " + Mname + " " + Fname);
    }
}

/*
- Fail Testing
- 5 of 10
 */