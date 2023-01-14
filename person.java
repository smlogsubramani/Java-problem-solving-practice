import java.util.Scanner;

public class person {
    
    private String name = "";
    private String Address ="";
    private String phonenumber= "";
    public String setname;
    public String setAddress;
    public String setphonenumber;

    //name
  
    public String getname(){
        return name;
        
    }
    public void setname(String name){
        this.name = name;
    }

    //address
    public String getAddress(){
        return Address;
        
    }
    public void setAddress(String Address){
        this.Address = Address;
    }

    //phonenumber

    public String getphonenumber(){
        return phonenumber;
    }

    public void setphonenumber(String phonenumber){
        this.phonenumber = phonenumber;
    }

}
