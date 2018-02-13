public class MaPyaeSuMon {
    public static void reverserNameFunction(String name)
    {
        StringBuilder ReverseName = new StringBuilder();
        String[] words = name.split(" ");
        for (int j = words.length-1; j >= 0; j-- ) {
            ReverseName.append(words[j]).append(' ');
        }
        System.out.println("Reverse words: " + ReverseName);
    }

    public static void main(String[] args) {
        reverserNameFunction("First Middle Last");
    }
}

/*
- Pass Testing
- Does not follow Naming Convention
- 9 of 10
 */
