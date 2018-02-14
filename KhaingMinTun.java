import java.util.Scanner;

public class KhaingMinTun {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter FirstName MiddleName LastName: ");
        String name = input.nextLine();
        String[] words = name.split(" ");
        for (int i = words.length - 1; i >= 0; i--) {
            System.out.print(words[i]);
        }

    }
}
/*
- Pass Test
- 2nd Part - Pass
- 10 of 10
 */