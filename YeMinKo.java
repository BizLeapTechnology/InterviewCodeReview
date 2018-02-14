import java.util.Scanner;

public class YeMinKo {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the sentense: ");
        String sentense=input.nextLine();
        String[] words=sentense.split(" ");
        for(int i=words.length-1;i>=0;i--){
            System.out.print(words[i]+" ");
        }
    }
}
/*
- Pass Testing
- 2nd Part - Pass
- Follow naming convention
- 10 of 10
 */