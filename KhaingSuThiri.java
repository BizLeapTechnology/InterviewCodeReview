import java.util.Scanner;

public class KhaingSuThiri {
    public static void main (String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name=input.nextLine();
        String[] words=name.split(" ");
        for(int i=words.length-1;i>=0;i--){
            System.out.print(words[i]+" ");
        }
    }
}

/*
- Pass Testing
- 2nd Part - Pass
- Follow Naming Convention
- 10 of 10
 */
