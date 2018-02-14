import java.util.Scanner;

public class HtetHtetSan {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please insert a sentence you want to reverse : ");
        String sentence=scanner.nextLine();
        String result="";
        String[] words=sentence.split(" ");
        for (int i=words.length-1;i>=0;i--){
            result+=words[i]+" ";
        }
        System.out.println("The reverse order is : "+result.trim());

    }
}
/*
- Pass Testing
- 2nd Part - Pass
- 10 of 10
 */