public class ShweYeeWin {
    public static void main(String[] args) {
        String input = "First Middle Last";
        StringBuilder input1 = new StringBuilder();
        input1.append(input);
        input1.reverse();
        for (int i=0; i < input.length(); i++)
            System.out.print(input1.charAt(i));
    }
}
/*
- Fail Testing
- Reverse Everything
 */