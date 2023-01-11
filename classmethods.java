public class classmethods {
    
    //method1
    public void car(){
        System.out.println("my car name is ciaz");
    }

    public void fullspeed(int speedmax){
        System.out.println("speed" + speedmax);
    }

    public static void main(String args[]){
        classmethods myobj = new classmethods();
        classmethods myobj1 = new classmethods();
        myobj1.fullspeed(200);
        myobj.car();
        

    }
    }


