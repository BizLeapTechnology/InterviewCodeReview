import java.util.Scanner;

public class SaungHninPhyu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String nameArr[] = name.split(" ");
        int a = nameArr.length;
        a -=1;
        for(int i = a; i >= 0; i--) {
            System.out.print(nameArr[i] + " ");
        }
    }
}

/*
- Pass Testing
- 2nd Part - Pass
- 10 of 10
 */