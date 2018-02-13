public class ThiriKoKo {
    public static String  convertName(String name)
    {
        String firstName = name.substring(0,name.indexOf(" "));
        String lastName = name.substring(name.indexOf(" ")+1);
        String cName = lastName  + ", " +  firstName;
        return cName;
    }
    public static void main(String args[])
    {
        String name = "Thiri Ko Ko";
        name = convertName(name);
        System.out.println(name);
    }
}
/*
- Fail Testing
- Work with just 2 words
- 7 of 10
 */