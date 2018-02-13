public class SuLattYadanar {
    public static void main(String args[]) {
        System.out.println("Enter Your Name");
        String name = "First Middle Last";
        reverseStringByWords(name);
    }

    public static void reverseStringByWords(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        String[] words = string.split(" ");
        for (int j = words.length - 1; j >= 0; j--) {
            stringBuilder.append(words[j]).append(' ');
        }
        System.out.println("Reverse words: " + stringBuilder);
    }
}

/*
- Pass Testing
- Follow Naming Convention
- 10 of 10
 */