import java.util.Scanner;

public class palindrom {
    public static void main(String args[]){
        try (Scanner getinput = new Scanner(System.in)) {
            System.out.println("Enter the word to check palindrom or not");
            String Userinput = getinput.nextLine();
            
            int strlength = Userinput.length();
            String reversestr ="";
            for(int i=(strlength-1);i>=0;i--){
                reversestr = reversestr + Userinput.charAt(i);
            }
            if(Userinput.toLowerCase().equals(reversestr.toLowerCase())){
                System.out.println(
                    "the given string is a palindrom"
                );
            }
            else{
                System.out.println("the given string is not a palindrom");
            }
        }


    }
}
