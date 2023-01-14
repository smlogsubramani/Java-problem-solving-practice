// import java.io.*;
import java.util.*;

public class substring {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        int total = A.length()+B.length();
        
        System.out.println(total);

        int cmp = A.compareTo(B);
        if(cmp>0)
        {
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }

        String a = A.substring(0, 1).toUpperCase()+A.substring(1); 
        String b = B.substring(0, 1).toUpperCase()+B.substring(1); 
        
        System.out.println(a+" "+b);

        
    }
}
