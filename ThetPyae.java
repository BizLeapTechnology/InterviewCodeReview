public class ThetPyae {
    public static void reverse(String[] str){
        String rev="";
        for( int n=str.length-1;n>=0;n--){
            rev += str[n]+"";
        }
        System.out.println(rev);
    }

    public static void main(String args[]){
        String[] st = "First Middle Last".split("");
        reverse(st);

    }
}
/*
- Fail Testing
- Reverse Everything
- 0 of 10
 */