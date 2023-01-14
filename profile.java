import java.util.ArrayList;
import java.util.Scanner;

public class profile {
    
    public static void main(String args[]){
        person details = new person();
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter your name");
            details.setname(sc.nextLine());
            System.out.println("Enter your address");
            details.setAddress(sc.nextLine());
            System.out.println("Enter your phonenumber");
            details.setphonenumber(sc.nextLine());
        }
        // System.out.println("The Name is "+ details.getname());
        // System.out.println("The Address is "+ details.getAddress());
        // System.out.println("The phonenumber is "+ details.getphonenumber());

        // String [] detailsinarray ={(details.getname()),(details.getAddress()),details.getphonenumber()};
        // System.out.println(detailsinarray);

        ArrayList<String> detailsinarray =  new ArrayList<>();
        detailsinarray.add(details.getname());
        detailsinarray.add(details.getAddress());
        detailsinarray.add(details.getphonenumber());
        System.out.println(detailsinarray);
    }

}
