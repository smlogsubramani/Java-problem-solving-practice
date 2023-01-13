abstract class loga{
    abstract void priya();
    public void lol(){
        System.out.println("hahaha");
    }
}

class panimalar extends loga{
    public void priya(){
        System.out.println("she loves kitkat");
    }
}
public class abstraction extends panimalar {

    public static void main(String args[]){
        panimalar myobj = new panimalar();
        myobj.lol();
        myobj.priya();
        };
    }
    

