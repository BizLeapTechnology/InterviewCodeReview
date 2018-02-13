public class SettPaingHtoo {
    public static String convertName(String name) {
        String firstName = name.substring(0, name.indexOf(" "));
        String lastName = name.substring(name.indexOf(" "));
        String cName = lastName +" "+ firstName;
        return cName;
    }
    public static void main(String args[]) {
        String name="First Last";
        convertName(name);
        System.out.println(convertName(name));
    }
}

/*
- Fail Testing
- Does not work with (First Middle Last)
- 7 of 10
 */
