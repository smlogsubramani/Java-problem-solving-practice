import java.util.ArrayList;
import java.util.Scanner;


public class profile1{
    public static ArrayList<person> arr = new ArrayList<person>();
    public static void GETINPUT()
    {
        person myobj = new person();
        {
          Scanner sc = new Scanner(System.in);
          myobj.setname(sc.nextLine());
          myobj.setAddress(sc.nextLine());
          arr.add(myobj);

        }
    }
    public static void main(String args[]){
        
    for(int i=0;i<=4;i++)
    {
        GETINPUT();
    }
       for (person i : arr ) {
        
            System.out.println(i.getname() +" "+ i.getAddress());
        }
         
        } 

    }

