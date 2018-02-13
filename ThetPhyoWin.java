public class ThetPhyoWin {
    public static void reverseName(String [] names){
        n=names.length;
        for(int i=n-1; i>0;i-- ){
            System.out.print (names[i]+" ");
        }
    }
    public static void main(String[] args) {
        String s = "Thet Phyo Win";
        String[] name = s.split(" ");
        reverseName(name);
    }
}

/*
- Fail Test
- need to declare in line 3
- There is a bug (can print just last 2 word) need to fix line 4
- 7 of 10
 */
