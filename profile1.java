import java.util.ArrayList;
import java.util.Scanner;
//datamodel

public class profile1{
    public static ArrayList<person> arr = new ArrayList<person>();
    public static void GETINPUT()
    {
        person myobj = new person();
        {
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter the name");
          myobj.setname(sc.nextLine());
          System.out.println("Enter the Address");
          myobj.setAddress(sc.nextLine());
          System.out.println("Enter the Phonenumber");
          myobj.setphonenumber(sc.nextLine());
          arr.add(myobj);

        }
    }
    public static void main(String args[]){
        
        
    for(int i=0;i<2;i++)
    {
        GETINPUT();
    }
    //    for (person i : arr ) {
        
    //         System.out.println(i.getname() +" "+ i.getAddress()+" "+ i.getphonenumber());
    //     }

        try (Scanner findscanner = new Scanner(System.in)) {
            System.out.println("Enter the mobile number");
            String mobnumber = findscanner.nextLine();
            person matchperson = arr.stream().filter(person->person.getphonenumber().equals(mobnumber)).findFirst().orElse(null);
            if(matchperson==null){
                System.out.println("There is no person with this mobilenumber");

            }
            else
            {
                System.out.println("The details of the entered phone number is");
                System.out.println(matchperson.getname());
                System.out.println(matchperson.getAddress());
                System.out.println(matchperson.getphonenumber());
            }
       
       
       
        }
    
           
        



        } 

    }

