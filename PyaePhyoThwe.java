import java.util.*;
class PyaePhyoThwe{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String name[]=sc.nextLine();
        String reverse="";
        System.out.print("Original name:"+name);
        for(int i =name.length-1;i>=0;i--)
        {
            reverse+=name[i];
            System.out.println("Reverse Name:"+reverse);
        }
    }
}

/*
- Fail Testing
- Error in line 5
- 0 of 10
 */